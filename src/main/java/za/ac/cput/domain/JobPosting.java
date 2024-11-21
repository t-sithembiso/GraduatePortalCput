package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Objects;

@Entity
public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;          // Unique identifier for the job
    private String date;        // Date the job was posted
    private String jobTitle;    // Title of the job
    private String timeFrame;   // Time frame of the job (e.g., Full-Time, Part-Time)
    private String location;    // Job location

    // Default constructor required by JPA
    protected JobPosting() {}

    // Private constructor for Builder pattern
    private JobPosting(Builder builder) {
        this.jobId = builder.jobId;
        this.date = builder.date;
        this.jobTitle = builder.jobTitle;
        this.timeFrame = builder.timeFrame;
        this.location = builder.location;
    }

    // Getters
    public int getJobId() {
        return jobId;
    }

    public String getDate() {
        return date;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getTimeFrame() {
        return timeFrame;
    }

    public String getLocation() {
        return location;
    }

    // Override equals and hashCode for proper comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosting that = (JobPosting) o;
        return jobId == that.jobId &&
                Objects.equals(date, that.date) &&
                Objects.equals(jobTitle, that.jobTitle) &&
                Objects.equals(timeFrame, that.timeFrame) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, date, jobTitle, timeFrame, location);
    }

    // Override toString for better readability
    @Override
    public String toString() {
        return "JobPosting{" +
                "jobId=" + jobId +
                ", date='" + date + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", timeFrame='" + timeFrame + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    // Builder class for creating JobPosting objects
    public static class Builder {
        private int jobId;
        private String date;
        private String jobTitle;
        private String timeFrame;
        private String location;

        public Builder setJobId(int jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setTimeFrame(String timeFrame) {
            this.timeFrame = timeFrame;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder copy(JobPosting jobPosting) {
            this.jobId = jobPosting.jobId;
            this.date = jobPosting.date;
            this.jobTitle = jobPosting.jobTitle;
            this.timeFrame = jobPosting.timeFrame;
            this.location = jobPosting.location;
            return this;
        }

        public JobPosting build() {
            return new JobPosting(this);
        }
    }
}
