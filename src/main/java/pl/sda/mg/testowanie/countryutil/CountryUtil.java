package pl.sda.mg.testowanie.countryutil;

public class CountryUtil {

    public static String getCountryNameByCode(String code) {
        if (code == null || code.length() != 2) {
            return "";
        }

        switch (code.toUpperCase()) {
            case "PL":
                return "Polska";
            case "GB":
                return "Wielka Brytania";
            case "FR":
                return "Francja";
        }

        return "";
    }
}
