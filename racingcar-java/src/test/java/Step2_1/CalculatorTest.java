package Step2_1;

import Step2_1.Domain.Calculator;
import Step2_1.View.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class CalculatorTest {
    private InputView inputView = new InputView();
    private Calculator calculator = new Calculator();

    CalculatorTest() throws IOException {
    }

    @DisplayName("덧셈 테스트")
    @CsvSource(value = {"1 + 2:3", "2 + 3:5"}, delimiter = ':')
    @Test
    void sumTest(String[] input, int expected){
        assertThat(calculator.calculate(input)).isEqualTo(expected);
    }
    @DisplayName("뺄셈 테스트")
    @Test
    void subTest(){

    }

    @DisplayName("곱셈 테스트")
    @Test
    void mulTest(){

    }

    @DisplayName("나눗셈 테스트")
    @Test
    void divTest(){

    }

}