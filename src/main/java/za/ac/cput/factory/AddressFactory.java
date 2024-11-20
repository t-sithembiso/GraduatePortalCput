package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.Helper;

public class AddressFactory {
    public static Address buildAdd(Long addressId,String province, String streetName, String city, int zipCode) {
        if (Helper.isNullOrEmpty(String.valueOf(addressId)) || Helper.isNullOrEmpty(String.valueOf(province))
                || Helper.isNullOrEmpty(streetName) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(String.valueOf(zipCode)))
            return null;
        return new Address.Builder()
                .setAddressId(addressId)
                .setProvince(province)
                .setStreetName(streetName)
                .setCity(city)
                .setZipCode(zipCode)
                .build();
    }



}
