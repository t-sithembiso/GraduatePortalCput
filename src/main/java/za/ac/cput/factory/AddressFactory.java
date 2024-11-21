package za.ac.cput.factory;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Address;
import za.ac.cput.util.Helper;

public class AddressFactory {
    public static Address buildAddress(int addressId, String province, String streetName, String city, int zipCode) {
        // Check if any of the fields are null or empty (for string fields)
        if (Helper.isNullOrEmpty(String.valueOf(addressId)) || Helper.isNullOrEmpty(province) ||
                Helper.isNullOrEmpty(streetName) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(String.valueOf(zipCode))) {
            return null;
        }
        // Build and return the Address object using the Builder pattern
        return new Address.Builder()
                .setAddressId(addressId)
                .setProvince(province)
                .setStreetName(streetName)
                .setCity(city)
                .setZipCode(zipCode)
                .build();
    }
}
