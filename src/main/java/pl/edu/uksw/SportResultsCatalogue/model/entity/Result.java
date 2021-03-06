package pl.edu.uksw.SportResultsCatalogue.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "result")
public class Result implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "timeresult")
    private long timeResult;

    @Column(name = "playernumber")
    private long playerNumber;  //player number in race

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "birthdate")
    private Date birthDate;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "teamname")
    private String teamName;

    @Column(name = "email")
    private String email;

    @Column(name = "raceid")
    private long raceId;

    @Column(name = "racename")
    private String raceName;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "racedate")
    private Date raceDate;

    @Column(name = "racelocalization")
    private String raceLocalization;

    @Column(name = "raceorganizator")
    private String raceOrganizator;

    @Column(name = "racedistance")
    private int raceDistance;

    public Result(){
        //for JPA
    }

    public Result(final RaceRegistrationDTO registrationDTO, final long registerNumber) {
        this.timeResult = 0;
        this.playerNumber = registerNumber;
        this.firstName = registrationDTO.getFirstName();
        this.lastName = registrationDTO.getLastName();
        this.birthDate = registrationDTO.getBirthDate();
        this.nationality = registrationDTO.getNationality();
        this.teamName = registrationDTO.getTeamName();
        this.email = registrationDTO.getEmail();
        this.raceId = registrationDTO.getRaceId();
        this.raceName = registrationDTO.getRaceName();
        this.raceDate = registrationDTO.getRaceDate();
        this.raceLocalization = registrationDTO.getRaceLocalization();
        this.raceOrganizator = registrationDTO.getRaceOrganizator();
        this.raceDistance = registrationDTO.getRaceDistance();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTimeResult() {
        return timeResult;
    }

    public void setTimeResult(long timeResult) {
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
