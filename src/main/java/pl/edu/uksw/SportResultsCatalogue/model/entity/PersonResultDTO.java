package pl.edu.uksw.SportResultsCatalogue.model.entity;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Timer;

public class PersonResultDTO {

    private long playerNumber;
    private String timeResult;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String nationality;
    private String teamName;


    public PersonResultDTO(final Result result) {
        this.playerNumber = result.getPlayerNumber();
        this.timeResult = generateTimeResult(result.getTimeResult());
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

    public String getTimeResult() {
        return timeResult;
    }

    public void setTimeResult(String timeResult) {
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

    private String generateTimeResult(final Long longResult) {
        String result;
        LocalTime duration = LocalTime.ofSecondOfDay(longResult);
        int hours = duration.getHour();
        duration = duration.minusHours(Integer.toUnsignedLong(hours));
        int minutes = duration.getMinute();
        duration = duration.minusMinutes(Integer.toUnsignedLong(minutes));
        result = String.format("%02d:%02d:%02d", hours, minutes, duration.getSecond());
        return result;
    }
}
