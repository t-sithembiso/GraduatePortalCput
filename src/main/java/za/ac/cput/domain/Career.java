package za.ac.cput.domain;

import java.sql.Blob;
import java.util.Objects;

public class Career {
    private int careerId;
    private String eventName;
    private String date;
    private String time;
    private String location;
    private String employers;
    private String description;
    private Blob image;

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

    public Blob getImage() {
        return image;
    }


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
                Objects.equals(image, career.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(careerId, eventName, date, time, location, employers, description, image);
    }


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
                ", image=" + image +
                '}';
    }

    public static class Builder {
        private int careerId;
        private String eventName;
        private String date;
        private String time;
        private String location;
        private String employers;
        private String description;
        private Blob image;

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

        public Builder setImage(Blob image) {
            this.image = image;
            return this;
        }

        public Builder copy(Career career) {
            this.careerId = career.careerId;
            this.eventName = career.eventName;
            this.date = career.date;
            this.time = career.time;
            this.location = career.location;
            this.employers = career.employers;
            this.description = career.description;
            this.image = career.image;
            return this;
        }

        public Career build() {
            return new Career(this);
        }
    }
}
