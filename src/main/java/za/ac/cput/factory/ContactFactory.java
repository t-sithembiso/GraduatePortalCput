package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory {

    public static Contact buildContact(int contactId, String email, String phoneNumber) {

        if (Helper.(contactId)
                || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(phoneNumber)) {
            return null;
        }


        return new Contact.Builder()
                .setContactId()
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .build();
    }
}
