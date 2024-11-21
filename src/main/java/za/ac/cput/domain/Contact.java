package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactId;
    private int phoneNumber; // Corrected attribute name
    private String email;

    private Contact(Builder builder) {
        this.contactId = builder.contactId;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    public Contact() {}

    public int getContactId() {
        return contactId;
    }

    public int getPhoneNumber() { // Corrected method name
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
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private int contactId;
        private int phoneNumber; // Aligned with the class attribute name
        private String email;

        public Builder setContactId(int contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) { // Aligned with class attribute name
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Contact contact) {
            this.contactId = contact.contactId;
            this.phoneNumber = contact.phoneNumber;
            this.email = contact.email;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
