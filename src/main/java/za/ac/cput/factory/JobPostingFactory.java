package za.ac.cput.factory;

import za.ac.cput.domain.JobPosting;
import za.ac.cput.util.Helper;

public class JobPostingFactory {

    public static JobPosting createJobPosting(int jobId, String date, String jobTitle, String timeFrame, String location) {
        // Validate input parameters
        if (Helper.isIntNullOrEmpty(jobId)
                || Helper.isNullOrEmpty(date)
                || Helper.isNullOrEmpty(jobTitle)
                || Helper.isNullOrEmpty(timeFrame)
                || Helper.isNullOrEmpty(location)) {
            return null;
        }

        // Return a new JobPosting object using the builder pattern
        return new JobPosting.Builder()
                .setJobId(jobId)
                .setDate(date)
                .setJobTitle(jobTitle)
                .setTimeFrame(timeFrame)
                .setLocation(location)
                .build();
    }
}
