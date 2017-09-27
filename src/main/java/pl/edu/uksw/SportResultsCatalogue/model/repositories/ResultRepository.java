package pl.edu.uksw.SportResultsCatalogue.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.edu.uksw.SportResultsCatalogue.model.entity.Result;

import java.time.Duration;
import java.util.List;

public interface ResultRepository extends MongoRepository<Result, Long> {

    public List<Result> findByTimeResultBetween(Duration from, Duration to);
    public List<Result> findByRaceName(String raceName);
    public List<Result> findByFirstNameAndLastName(String firstName, String lastName);
}
