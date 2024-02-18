package seminars.third.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @ParameterizedTest
    @CsvSource({"2", "4", "6", "8"})
    void evenOddNumberTrue(int i) {
        MainHW m = new MainHW();

        assertTrue(m.evenOddNumber(i));

    }

    @ParameterizedTest
    @CsvSource({"3", "5", "7", "9"})
    void evenOddNumberFalse(int i) {
        MainHW m = new MainHW();

        assertFalse(m.evenOddNumber(i));

    }

    @ParameterizedTest
    @CsvSource({"3", "5", "7", "9"})
    void numberNotInterval(int i){
        MainHW m = new MainHW();
        assertFalse(m.numberInInterval(i));
    }

    @ParameterizedTest
    @CsvSource({"26", "50", "70", "90"})
    void numberInInterval(int i){
        MainHW m = new MainHW();
        assertTrue(m.numberInInterval(i));
    }





}