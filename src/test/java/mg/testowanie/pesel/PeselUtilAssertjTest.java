package mg.testowanie.pesel;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

public class PeselUtilAssertjTest {

    @Test
    void shouldReturnBirthDateForExistingPesel() {
        //given
        String pesel = "84093011111";

        //when
        LocalDate calculatedBirthDate = PeselUtil.getBirthDate(pesel);

        //then
        assertThat(calculatedBirthDate)
                .isNotNull()
                .isEqualTo("1984-09-30");
    }
}
