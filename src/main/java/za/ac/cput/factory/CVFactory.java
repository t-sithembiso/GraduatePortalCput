package za.ac.cput.factory;


import za.ac.cput.domain.CV;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class CVFactory {

    public static CV buildCV(int cvId, int studentId, String filename, LocalDate date, String fileType) {
        // Validate inputs
        if (Helper.isInvalidId(cvId) || Helper.isInvalidId(studentId)) {
            throw new IllegalArgumentException("Invalid IDs provided.");
        }

        if (Helper.isNullOrEmpty(filename) || Helper.isNullOrEmpty(fileType)) {
            throw new IllegalArgumentException("Filename or file type cannot be null or empty.");
        }

        if (date == null) {
            date = LocalDate.now(); // Default to today's date if no date is provided
        }

        // Build and return a CV object
        return new CV.Builder()
                .setCvId(cvId)
                .setStudentId(studentId)
                .setFilename(filename)
                .setDate(date)
                .setFileType(fileType)
                .build();
    }
}
