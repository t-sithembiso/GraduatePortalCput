//package za.ac.cput.factory;
//
//import za.ac.cput.domain.Address;
//import za.ac.cput.domain.Career;
//import za.ac.cput.util.Helper;
//
//import java.sql.Blob;
//
//public class CareerFactory {
//    public static Career buildAdd(int careerId, String eventName, String streetName, String date, String time,String location,String employers,String description,Blob image) {
//        if (Helper.isNullOrEmpty(String.valueOf(addressId)) || Helper.isNullOrEmpty(String.valueOf(province))
//                || Helper.isNullOrEmpty(streetName) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(String.valueOf(zipCode)))
//            return null;
//        return new Address.Builder()
//                .setAddressId(addressId)
//                .setProvince(province)
//                .setStreetName(streetName)
//                .setCity(city)
//                .setZipCode(zipCode)
//                .build();
//    }
//}
