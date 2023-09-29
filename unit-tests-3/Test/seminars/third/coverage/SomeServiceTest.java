package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    @Test
    void checkArray(){
        SomeService someService = new SomeService();
        assertThat(someService.firstLast6(new int[]{1, 2, 6})).isTrue();
        assertThat(someService.firstLast6(new int[]{6, 3, 1})).isTrue();
        assertThat(someService.firstLast6(new int[]{1, 1, 1})).isFalse();
    }
   // 3.1.

    void multipleThreeNotFiveReturnsFizz(int n) {
        // assertEquals...
    }

}