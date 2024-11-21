package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Objects;

@Entity
public class Career {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int careerId;
    private String eventName;
    private String date;
    private String time;
    private String location;
    private String employers;
    private String description;

    @Lob
    @Column(length = 1000000)
    private byte[] image;  // Correct type for image data (byte[])

    // Private constructor to enforce immutability and use Builder
    private Career(Builder builder) {
        this.careerId = builder.careerId;
        this.eventName = builder.eventName;
        this.date = builder.date;
        this.time = builder.time;
        this.location = builder.location;
        this.employers = builder.employers;
        this.description = builder.description;
        this.image = builder.image;
    }

    // No-argument constructor required by JPA
    protected Career() {}

    // Getters
    public int getCareerId() {
        return careerId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getEmployers() {
        return employers;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getImage() {
        return image;
    }

    // Overriding equals for object comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Career career = (Career) o;
        return careerId == career.careerId &&
                Objects.equals(eventName, career.eventName) &&
                Objects.equals(date, career.date) &&
                Objects.equals(time, career.time) &&
                Objects.equals(location, career.location) &&
                Objects.equals(employers, career.employers) &&
                Objects.equals(description, career.description) &&
                Arrays.equals(image, career.image);  // Compare image arrays
    }

    // Overriding hashCode for hash consistency
    @Override
    public int hashCode() {
        int result = Objects.hash(careerId, eventName, date, time, location, employers, description);
        result = 31 * result + Arrays.hashCode(image);  // Include image in hashCode
        return result;
    }

    // Overriding toString for readability
    @Override
    public String toString() {
        return "Career{" +
                "careerId=" + careerId +
                ", eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", employers='" + employers + '\'' +
                ", description='" + description + '\'' +
                ", image=" + Arrays.toString(image) +  // Display image as array string
                '}';
    }

    // Builder class for constructing Career objects
    public static class Builder {
        private int careerId;
        private String eventName;
        private String date;
        private String time;
        private String location;
        private String employers;
        private String description;
        private byte[] image;  // Use byte[] instead of Byte[]

        // Setter methods for configuring the builder
        public Builder setCareerId(int careerId) {
            this.careerId = careerId;
            return this;
        }

        public Builder setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setEmployers(String employers) {
            this.employers = employers;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImage(byte[] image) {  // Accept byte[] image here
            this.image = image;
            return this;
        }

        // Build method to create the Career object
        public Career build() {
            return new Career(this);
        }
    }
}
