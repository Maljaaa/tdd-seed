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

class StringTestTest {

    @Test
    void split1_1(){
        String[] str = "1,2".split(",");
        assertThat(str).contains("1", "3");
    }

    @Test
    void split1_2(){
        String[] str = "1".split(",");
        assertThat(str).containsExactly("1");
    }

    @Test
    void split2(){
        String str = "(1,2)";
        String substring = str.substring(1, str.length() - 1);
        System.out.println(substring);
    }

    @Test
    void split3_1(){
        String str = "abc";
        char text = str.charAt(1);
        assertThat(text).isEqualTo('b');
    }

    @Test
    @DisplayName("StringIndexOutofBoundsException 발생")
    void split3_2(){
        String str = "abc";
        char text = str.charAt(5);
        assertThat(text).isEqualTo('b');
    }

    // Set Collection Test
    private Set<Integer> numbers;

    @BeforeEach
    void setup(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void set1(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void set2(int input) {
        assertTrue(numbers.contains(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true","2:true","3:true","4:false", "5:false"}, delimiter = ':')
    void set2(int input, boolean expected){
        assertEquals(numbers.contains(input), expected);
    }
}