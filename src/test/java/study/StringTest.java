package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void split(){
        String testString1 = "1,2";
        String testString2 = "1";

        String[] splitTestString1 = testString1.split(",");
        String[] splitTestString2 = testString2.split(",");


        assertThat(splitTestString1).contains("1");
        assertThat(splitTestString1).contains("2");
        assertThat(splitTestString1).containsExactly("1","2");

        assertThat(splitTestString2).contains("1");
        assertThat(splitTestString2).containsExactly("1");
    }

    @Test
    void substring(){
        String testString = "(1,2)";

        String subString = testString.substring(1, testString.length()-1);

        assertThat(subString).isEqualTo("1,2");
    }

    @Test
    void charAt(){
        String testString = "abc";


        assertThat(testString.charAt(0)).isEqualTo('a');
        assertThat(testString.charAt(1)).isEqualTo('b');
        assertThat(testString.charAt(2)).isEqualTo('c');
    }

    @Test
    @DisplayName("charAt 범위를 벗어나는 경우 StringIndexOutOfBoundsException 발생")
    void charAtException(){
        String testString = "abc";

        assertThatThrownBy( () -> { testString.charAt(3); } )
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range");


        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> { testString.charAt(3); })
                .withMessage("String index out of range: %s", "3")
                .withMessageMatching("String index out of range: 3")
                .withMessageContaining("String index out of range")
        ;
    }
}
