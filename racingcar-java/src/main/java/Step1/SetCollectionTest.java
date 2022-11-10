package Step1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SetCollectionTest {
    private Set<Integer> numbers;

    // 각 테스트 함수가 불리기 전에 매 번 호출됌
    @BeforeEach
    void setup(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

//    [ @BeforeEach ]
//    - 각 테스트 함수가 불리기 전에 매 번 호출
//    [ @BeforeAll ]
//    - 테스트 함수가 불리기 전에 딱 한 번 호출

    @Test
    @DisplayName("사이즈 확인")
    void checkSize(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("중복을 제거한 값 확인")
    // 해당 annotation에 지정한 배열을 파라미터 값으로 순서대로 넘겨준다
    // test method 실행 당 하나의 인자만을 전달할 때 사용할 수 있다.
    // 리터럴 값의 배열을 테스트 메서드에 전달한다.
    @ValueSource(ints = {1,2,3})
    void checkElement(int input) {
        assertTrue(numbers.contains(input));    // assertTrue(); => assertThat().isTrue();
    }

    @ParameterizedTest
    @DisplayName("중복을 제거한 csvSource")
//    CsvSource의 value 속성으로 다음과 같이 파라미터를 던질 수 있다.
//    이렇게 문자열로 구분자 콤마(,)를 기준으로 값을 잘라서 파라미터에 담아줄 것이다.
//    모든 문자는 String
//    @CsvSource 어노테이션에 delimiter을 직접 정의함으로써 구분자를 지정할 수 있다.
    @CsvSource(value = {"1:true","2:true","3:true","4:false", "5:false"}, delimiter = ':')
    void compareCsv(int input, boolean expected){
        assertEquals(numbers.contains(input), expected);    // assertEquals(); => assertThat().isEqualTo();
    }
}