package za.ac.cput.domain;

import java.util.Objects;

public class Contact {
    private int contactId;
    private int phoneNumber;
    private String email;

    private Contact(Builder builder) {
        this.contactId = builder.contactId;
        this.phoneNumber = builder.contactNumber;
        this.email = builder.email;
    }

    public Contact() {}

    public int getContactId() {
        return contactId;
    }

    public int getContactNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return contactId == contact.contactId &&
                phoneNumber == contact.phoneNumber &&
                Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", contactNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private int contactId;
        private int contactNumber; // Corrected naming
        private String email;

        public Builder setContactId(int contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder setContactNumber(int contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Contact contact) {
            this.contactId = contact.contactId;
            this.contactNumber = contact.phoneNumber; // Corrected reference
            this.email = contact.email;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
