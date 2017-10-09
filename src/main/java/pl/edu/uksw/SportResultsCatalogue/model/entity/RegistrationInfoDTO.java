package pl.edu.uksw.SportResultsCatalogue.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.Date;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = RegistrationInfoDTO.class)
public class RegistrationInfoDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String raceName;
    private Date raceDate;

    public RegistrationInfoDTO(){

    }

    public RegistrationInfoDTO(final RaceRegistrationDTO registrationDTO){
        this.firstName = registrationDTO.getFirstName();
        this.lastName = registrationDTO.getLastName();
        this.email = registrationDTO.getEmail();
        this.raceName = registrationDTO.getRaceName();
        this.raceDate = registrationDTO.getRaceDate();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String toString(){
        JSONObject jsonInfo = new JSONObject();

        try {
            jsonInfo.put("firstName", this.firstName);
            jsonInfo.put("lastName", this.lastName);
            jsonInfo.put("email", this.email);
            jsonInfo.put("raceName", this.raceName);
            jsonInfo.put("raceDate", this.raceDate);
        } catch (JSONException e1) {}
        return jsonInfo.toString();
    }
}
