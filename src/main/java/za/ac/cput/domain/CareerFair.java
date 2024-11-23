package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CareerFair {
    @Id
    @GeneratedValue
    private int careerFairId;
    private String eventName;
    private String description;
    private String location;
    private LocalDate eventDate;
    private Boolean rsvp;
    private LocalDate rsvpDate;
    private String organiserName;
    private String organiserPhone;
    private String organiserEmail;


    public CareerFair(int careerFairId, String eventName, String description, String location, LocalDate eventDate, Boolean rsvp, LocalDate rsvpDate, String organiserName, String organiserPhone, String organiserEmail) {
        this.careerFairId = careerFairId;
        this.eventName = eventName;
        this.description = description;
        this.location = location;
        this.eventDate = eventDate;
        this.rsvp = rsvp;
        this.rsvpDate = rsvpDate;
        this.organiserName = organiserName;
        this.organiserPhone = organiserPhone;
        this.organiserEmail = organiserEmail;
    }

    @Override
    public String toString() {
        return "CareerFair{" +
                "careerFairsId=" + careerFairId +
                ", eventName='" + eventName + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", eventDate=" + eventDate +
                ", rsvp=" + rsvp +
                ", rsvpDate=" + rsvpDate +
                ", organiserName='" + organiserName + '\'' +
                ", organiserPhone='" + organiserPhone + '\'' +
                ", organiserEmail='" + organiserEmail + '\'' +
                '}';
    }
}
