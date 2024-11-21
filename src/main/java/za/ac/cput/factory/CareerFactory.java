package za.ac.cput.factory;

import za.ac.cput.domain.Career;
import za.ac.cput.util.Helper;

public class CareerFactory {

    // Build Career object with validation
    public static Career buildCareer(int careerId, String eventName, String date, String time, String location,
                                     String employers, String description, byte[] image) {

        // Validate inputs using Helper utility
        if (Helper.isIntNullOrEmpty(careerId) || Helper.isNullOrEmpty(eventName) || Helper.isNullOrEmpty(date) ||
                Helper.isNullOrEmpty(time) || Helper.isNullOrEmpty(location) || Helper.isNullOrEmpty(employers) ||
                Helper.isNullOrEmpty(description) || Helper.isObjectNotValid(image)) {
            return null; // Return null if any validation fails
        }

        // Create and return Career object using the Builder pattern
        return new Career.Builder()
                .setCareerId(careerId)
                .setEventName(eventName)
                .setDate(date)
                .setTime(time)
                .setLocation(location)
                .setEmployers(employers)
                .setDescription(description)
                .setImage(image)  // Use byte[] image here
                .build();
    }
}
