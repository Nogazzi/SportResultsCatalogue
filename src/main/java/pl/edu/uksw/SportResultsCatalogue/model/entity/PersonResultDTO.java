package pl.edu.uksw.SportResultsCatalogue.model.entity;

import java.util.Date;

public class PersonResultDTO {

    private long playerNumber;
    private long timeResult;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String nationality;
    private String teamName;


    public PersonResultDTO(final Result result) {
        this.playerNumber = result.getPlayerNumber();
        this.timeResult = result.getTimeResult();
        this.firstName = result.getFirstName();
        this.lastName = result.getLastName();
        this.birthDate = result.getBirthDate();
        this.nationality = result.getNationality();
        this.teamName = result.getTeamName();
    }

    public long getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(long playerNumber) {
        this.playerNumber = playerNumber;
    }

    public long getTimeResult() {
        return timeResult;
    }

    public void setTimeResult(long timeResult) {
        this.timeResult = timeResult;
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
}
