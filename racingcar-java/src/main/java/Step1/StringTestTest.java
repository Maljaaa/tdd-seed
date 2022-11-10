package Step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringTestTest {

    @Test   // 해당 메서드가 단위 테스트임을 명시하는 어노테이션
    @DisplayName("'1,2'를 ','로 나누기")    // 읽기 좋은 다른 이름을 부여하는 어노테이션
    void split_Comma(){ // comma로 숫자를 분리하겠다는 메서드
        String[] str = "1,2".split(",");
        assertThat(str).contains("1", "3"); // 일부로 틀린 결과 값을 테스트한다면 에러 발생
    }

    @Test
    @DisplayName("'1,2'를 ','로 정확하게 나누기")
    void split_Comma_Exactly(){
        String[] str = "1,2".split(",");
        assertThat(str).containsExactly("1", "2");
    }

//    [ contains() ]
//    - 모든 원소를 입력하지 않아도 성공
//    - 중복된 값이 있어도 포함만 되어 있으면 성공
//    - 순서가 바뀌어도 값만 맞으면 성공
//    - List에 없는 값을 입력하면 실패
//
//    [ containsExactly() ]
//    - 원소가 정확히 일치해야 한다.
//    - 중복된 값이 있어도 안되고 순서가 달라져도 안된다.
//    - 특정 자료구조의 정확한 값을 테스트 하고 싶은 경우에는 이 메서드를 사용할 수 있다.
//
//    [ containsOnly ]
//    - 원소의 순서, 중복 여부 관계 없이 값만 일치하면 된다.
//    - contains와 달리 원소값은 정확히 일치해야 한다.

    @Test
    @DisplayName("()제거 후 값 반환")
    void split_realValue(){
        String str = "(1,2)";
        String substring = str.substring(1, str.length() - 1);  // substring으로 문자열을 배열처럼 쪼개서 사용 가능
        System.out.println(substring);
    }

    @Test
    @DisplayName("문자열에서 원하는 위치의 문자 가져오기")
    void split3_1(){
        String str = "abc";
        char text = str.charAt(1);  // charAt() 메서드로 특정 위치의 문자를 가져올 수 있음
        assertThat(text).isEqualTo('b');
    }

    @Test
    @DisplayName("StringIndexOutofBoundsException 발생")
    void split3_2(){
        String str = "abc";
        char text = str.charAt(5);
        assertThat(text).isEqualTo('b');
    }

//    [ isEqualTo ]
//    - 대상의 내용 자체를 비교

//    [ isSameTo ]
//    - 대상의 주소 값을 비교

}