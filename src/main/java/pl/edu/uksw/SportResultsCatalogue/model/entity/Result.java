package pl.edu.uksw.SportResultsCatalogue.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.Duration;
import java.util.Date;

public class Result {

    @Id
    private long id;

    private Duration timeResult;

    private long playerNumber;  //player number in race
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String nationality;
    private String teamName;

    private long raceId;
    private String raceName;
    private String raceLocalization;
    private String raceOrganizator;
    private int raceDistance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Duration getTimeResult() {
        return timeResult;
    }

    public void setTimeResult(Duration timeResult) {
        this.timeResult = timeResult;
    }

    public long getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(long playerNumber) {
        this.playerNumber = playerNumber;
    }

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
