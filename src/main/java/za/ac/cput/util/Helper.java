package za.ac.cput.util;



import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public class Helper {
    public static Boolean isNullOrEmpty(String s){
        if(s == null || s.isEmpty())
            return true;
        return false;

    } // Validate email address
    public static boolean isValidEmailAddress(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    // Validate phone number (10 digits)
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\d{10}$";
        return Pattern.compile(phoneRegex).matcher(phoneNumber).matches();
    }


    public static Boolean isListNullOrEmpty(List list){
        if(list == null || list.isEmpty())
            return true;
        return false;

    }


    public static Boolean isIntegerNotValid(Integer integer){
        if(integer == null || integer.toString().isEmpty())
            return true;
        return false;

    }

    public static Boolean isLongNotValid(Long l){
        if(l == null || l.longValue() <= 0)
            return true;
        return false;

    }



    public static boolean isObjectNotValid(Object obj) {
        return obj == null;
    }



    public static String generateId(){
        return UUID.randomUUID().toString();
    }

    public static boolean isArrayNullOrEmpty(byte[] array) {
        return array == null || array.length == 0;
    }
    public static Boolean isIntNullOrEmpty(Integer num){
        if(num == null || num == 0){
            return true;
        }
        return false;
    }
}

