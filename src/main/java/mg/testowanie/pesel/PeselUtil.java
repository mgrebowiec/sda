package mg.testowanie.pesel;

import java.time.LocalDate;
import java.util.Objects;

public class PeselUtil {
    private static final int PESEL_LENGTH = 11;

    public static LocalDate getBirthDate(String pesel) {
        if (Objects.isNull(pesel) || pesel.trim().isEmpty()) {
            return null;
        }

        if (pesel.length() != PESEL_LENGTH) {
            return null;
        }

        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));

        return LocalDate.of(calculateBirthYear(month, year), calculateBirthMonth(month), day);
    }

    private static int calculateBirthMonth(int month) {
        if (month > 80 && month < 93) {
            return month - 80;
        }

        if (month > 20 && month < 33) {
            return month - 20;
        }

        if (month > 40 && month < 53) {
            return month - 40;
        }

        if (month > 60 && month < 73) {
            return month - 60;
        }

        return month;
    }

    private static int calculateBirthYear(int month, int year) {
        if (month > 80 && month < 93) {
            return year + 1800;
        }

        if (month > 0 && month < 13) {
            return year + 1900;
        }

        if (month > 20 && month < 33) {
            return year + 2000;
        }

        if (month > 40 && month < 53) {
            return year + 2100;
        }

        if (month > 60 && month < 73) {
            return year + 2200;
        }

        return year;
    }
}
