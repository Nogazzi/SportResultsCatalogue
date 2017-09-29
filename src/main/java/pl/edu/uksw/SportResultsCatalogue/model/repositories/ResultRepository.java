package pl.edu.uksw.SportResultsCatalogue.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.uksw.SportResultsCatalogue.model.entity.Result;

import java.time.Duration;
import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {

    public List<Result> findByTimeResultBetween(Duration from, Duration to);
    public List<Result> findByRaceName(String raceName);
    public List<Result> findByFirstNameAndLastName(String firstName, String lastName);
    public List<Result> findByRaceId(Long id);
}
