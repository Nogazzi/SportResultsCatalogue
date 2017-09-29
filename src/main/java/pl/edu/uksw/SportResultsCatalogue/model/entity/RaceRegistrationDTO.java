package pl.edu.uksw.SportResultsCatalogue.model.entity;

import java.util.Date;

public class RaceRegistrationDTO {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String nationality;
    private String teamName;
    private String email;
    private long raceId;
    private String raceName;
    private Date raceDate;
    private String raceLocalization;
    private String raceOrganizator;
    private int raceDistance;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getRaceId() {
        return raceId;
    }

    public void setRaceId(long raceId) {
        this.raceId = raceId;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public Date getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(Date raceDate) {
        this.raceDate = raceDate;
    }

    public String getRaceLocalization() {
        return raceLocalization;
    }

    public void setRaceLocalization(String raceLocalization) {
        this.raceLocalization = raceLocalization;
    }

    public String getRaceOrganizator() {
        return raceOrganizator;
    }

    public void setRaceOrganizator(String raceOrganizator) {
        this.raceOrganizator = raceOrganizator;
    }

    public int getRaceDistance() {
        return raceDistance;
    }

    public void setRaceDistance(int raceDistance) {
        this.raceDistance = raceDistance;
    }
}
