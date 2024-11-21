package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory {

    public static Contact buildContact(int contactId, String phoneNumber, String email) {
        // Validation using Helper methods
        if (Helper.isIntNullOrEmpty(contactId)
                || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(phoneNumber)) {
            return null;
        }

        // Additional validations
        if (!Helper.isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
        if (!Helper.isValidEmailAddress(email)) {
            throw new IllegalArgumentException("Invalid email address format.");
        }

        // Return new Contact instance using the builder pattern
        return new Contact.Builder()
                .setContactId(contactId)
                .setPhoneNumber(Integer.parseInt(phoneNumber))
                .setEmail(email)
                .build();
    }
}
