package pl.sda.mg.testowanie.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TddArrayUtilTest {

    @Test
    void shouldReturnEmptyArrayWhenArrayIsNullAndElementsDoesntExist() {
        //given
        String[] sampleArray = null;

        //when
        String[] result = ArrayUtil.removeElements(sampleArray, null);

        //then
        Assertions.assertThat(result)
                .isNotNull()
                .hasSize(0);
    }

    @Test
    void shouldReturnEmptyArrayWhenArrayIsNullAndElementsExist() {
        //given
        String[] sampleArray = null;

        //when
        String[] result = ArrayUtil.removeElements(sampleArray, "first");

        //then
        Assertions.assertThat(result)
                .isNotNull()
                .hasSize(0);
    }

    @Test
    void shouldReturnArrayContainingElement() {
        //given
        String[] sampleArray = {"first", "second"};

        //when
        String[] result = ArrayUtil.removeElements(sampleArray, "first");

        //then
        Assertions.assertThat(result)
                .isNotNull()
                .hasSize(1)
                .containsExactly("second");
    }

    @Test
    void shouldReturnArrayContainingAllElements() {
        //given
        String[] sampleArray = {"first", "second"};

        //when
        String[] result = ArrayUtil.removeElements(sampleArray, "third");

        //then
        Assertions.assertThat(result)
                .isNotNull()
                .hasSize(2)
                .containsExactly("first", "second");
    }

}
