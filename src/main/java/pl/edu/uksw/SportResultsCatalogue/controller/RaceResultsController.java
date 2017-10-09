package pl.edu.uksw.SportResultsCatalogue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.uksw.SportResultsCatalogue.messaging.RabbitMessageProducer;
import pl.edu.uksw.SportResultsCatalogue.model.entity.PersonResultDTO;
import pl.edu.uksw.SportResultsCatalogue.model.entity.RaceRegistrationDTO;
import pl.edu.uksw.SportResultsCatalogue.model.entity.RegistrationInfoDTO;
import pl.edu.uksw.SportResultsCatalogue.model.entity.Result;
import pl.edu.uksw.SportResultsCatalogue.model.repositories.ResultRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/results")
public class RaceResultsController {

    static Logger log = Logger.getLogger(RaceResultsController.class.getName());

    @Autowired
    RabbitMessageProducer rabbitMessageProducer;

    @Autowired
    private ResultRepository resultRepository;

    @GetMapping(value = "/")
    public List<PersonResultDTO> findAll() {
        final List<PersonResultDTO> resultsDTO = new ArrayList<>();
        final List<Result> results = resultRepository.findAll();
        results.stream().forEach(result -> {
            resultsDTO.add(new PersonResultDTO(result));
        });
        return resultsDTO;
    }

    @GetMapping(value = "/{id}")
    public List<PersonResultDTO> resultsByRaceId(@PathVariable final long id) {
        final List<PersonResultDTO> resultsDTO = new ArrayList<>();
        final List<Result> results = resultRepository.findByRaceId(id);
        results.stream().forEach(result -> {
            resultsDTO.add(new PersonResultDTO(result));
        });
        log.info("Results for event id: " + id + " count: " + results.size());
        return resultsDTO;
    }


    @PostMapping(value = "/registerResult")
    public ResponseEntity<String> registerNewResult(@RequestBody final RaceRegistrationDTO registrationDTO){
        final long playerNumber = resultRepository.findByRaceId(registrationDTO.getRaceId()).size()+1;
        final Result result = new Result(registrationDTO, playerNumber);
        resultRepository.save(result);
        log.info("Player registered for event: " + registrationDTO + " with id: " + playerNumber);

        RegistrationInfoDTO registrationInfoDTO = new RegistrationInfoDTO(registrationDTO);
        rabbitMessageProducer.sendRegistrationConfirm(registrationInfoDTO);
        log.info("Message sent: " + registrationInfoDTO);

        return ResponseEntity.ok("Result: " + result.toString() + " , added succesfully");
    }

    @PatchMapping(value = "/fillResults/{id}")
    public ResponseEntity<String> fillResultsForRace(@PathVariable final long id) {
        final List<Result> results = resultRepository.findByRaceId(id);
        log.info("Updating " + results.size() + " results for race with id: " + id);
        results.stream().forEach(result -> {
            result.setTimeResult(Math.abs(new Random().nextLong()%10000));
            resultRepository.save(result);
            log.info("Updated result: " + result);
        });
        return ResponseEntity.ok("Results for race filled succesfully");
    }

}
