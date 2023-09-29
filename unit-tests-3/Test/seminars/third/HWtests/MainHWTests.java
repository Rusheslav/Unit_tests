package seminars.third.HWtests;

import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainHWTests {
    @Test
    void testEvenTrue() {
        assertThat(MainHW.evenOddNumber(2)).isTrue();
    }

    @Test
    void testOddFalse() {
        assertThat(MainHW.evenOddNumber(3)).isFalse();
    }

    @Test
    void testZeroTrue() {
        assertThat(MainHW.evenOddNumber(0)).isTrue();
    }

    @Test
    void testNegativeEvenTrue() {
        assertThat((MainHW.evenOddNumber(-10))).isTrue();
    }

    @Test
    void testNumberInsideInterval() {
        assertThat((MainHW.numberInInterval(25))).isTrue();
    }

    @Test
    void testNumberOutsideInterval() {
        assertThat((MainHW.numberInInterval(101))).isFalse();
    }
}
