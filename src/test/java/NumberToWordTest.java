import org.junit.*;
import static org.junit.Assert.*;

public class NumberToWordTest {

  @Test
  public void isNumberToWord_returnSixwhengiven6_six() {
    NumberToWord testNumberToWord = new NumberToWord();
    String numberWord = "six";
    assertEquals(numberWord, testNumberToWord.isNumberToWord(6));
  }

}
