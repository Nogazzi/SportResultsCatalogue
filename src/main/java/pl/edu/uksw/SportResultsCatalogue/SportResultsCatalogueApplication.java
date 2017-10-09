package pl.edu.uksw.SportResultsCatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"pl.edu.uksw.SportResultsCatalogue"})
public class SportResultsCatalogueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportResultsCatalogueApplication.class, args);
    }
}
