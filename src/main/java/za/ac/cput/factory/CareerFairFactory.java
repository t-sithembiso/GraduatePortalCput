package za.ac.cput.factory;

import za.ac.cput.domain.CareerFair;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class CareerFairFactory {

    public static CareerFair buildCareerFair(int careerFairId, String eventName, String description, String location, LocalDate eventDate, Boolean rsvp, LocalDate rsvpDate, String organiserName, String organiserPhone, String organiserEmail) {
        if (careerFairId <= 0 || Helper.isNullOrEmpty(eventName) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(location)
            || eventDate == null || rsvp == null || rsvpDate == null || Helper.isNullOrEmpty(organiserName) || Helper.isNullOrEmpty(organiserPhone) || Helper.isNullOrEmpty(organiserEmail)) {
            return null;
        }


        return CareerFair.builder()
                .careerFairId(careerFairId)
                .eventName(eventName)
                .description(description)
                .location(location)
                .eventDate(eventDate)
                .rsvp(rsvp)
                .rsvpDate(rsvpDate)
                .organiserName(organiserName)
                .organiserPhone(organiserPhone)
                .organiserEmail(organiserEmail)
                .build();
    }

    public static CareerFair buildCareerFairWithoutId( String eventName, String description, String location, LocalDate eventDate, Boolean rsvp, LocalDate rsvpDate, String organiserName, String organiserPhone, String organiserEmail) {
        if (Helper.isNullOrEmpty(eventName) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(location)
                || eventDate == null || rsvp == null || rsvpDate == null || Helper.isNullOrEmpty(organiserName) || Helper.isNullOrEmpty(organiserPhone) || Helper.isNullOrEmpty(organiserEmail)) {
            return null;
        }

        return CareerFair.builder()
                .eventName(eventName)
                .description(description)
                .location(location)
                .eventDate(eventDate)
                .rsvp(rsvp)
                .rsvpDate(rsvpDate)
                .organiserName(organiserName)
                .organiserPhone(organiserPhone)
                .organiserEmail(organiserEmail)
                .build();
    }
}
