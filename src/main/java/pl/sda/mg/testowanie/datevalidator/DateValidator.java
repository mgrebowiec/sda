package pl.sda.mg.testowanie.datevalidator;

import java.time.LocalDate;

public class DateValidator {
    private static final LocalDate START_DATE = LocalDate.of(2021, 1, 1);
    private static final LocalDate END_DATE = LocalDate.of(2021, 4, 1);

    public static boolean isValidDate(LocalDate date) {
        if (date == null) {
            return false;
        }

        if (START_DATE.isAfter(date)) {
            return false;
        }

        if (END_DATE.isBefore(date)) {
            return false;
        }

        return true;
    }
}
