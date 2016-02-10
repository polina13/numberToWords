
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class NumberToWord {
  public static void main(String[] args) {}

  public static Object isNumberToWord(Integer userNumberInput){
    HashMap<Integer,String> numberWordSequence = new HashMap<Integer,String>();
    Object result = new Object();

    numberWordSequence.put(1, "one");
    numberWordSequence.put(2, "two");
    numberWordSequence.put(3, "three");
    numberWordSequence.put(4, "four");
    numberWordSequence.put(5, "five");
    numberWordSequence.put(6, "six");
    numberWordSequence.put(7, "seven");
    numberWordSequence.put(8, "eight");
    numberWordSequence.put(9, "nine");
    numberWordSequence.put(10, "ten");
    numberWordSequence.put(11, "eleven");
    numberWordSequence.put(12, "twelve");
    numberWordSequence.put(13, "thirteen");
    numberWordSequence.put(14, "fourteen");
    numberWordSequence.put(15, "fifteen");
    numberWordSequence.put(16, "sixteen");
    numberWordSequence.put(17, "seventeen");
    numberWordSequence.put(18, "eighteen");
    numberWordSequence.put(19, "nineteen");

    ArrayList<String[]> list = new ArrayList<String[]>();
    String[] TwoDigits = { "twenty", "thirty",
  "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    list.add(TwoDigits);

  if (userNumberInput <= 19) {
    for (Object key : numberWordSequence.keySet() ) {
      for (Object value : numberWordSequence.values() ) {
        if(numberWordSequence.containsKey(userNumberInput)) {
          result = numberWordSequence.get(userNumberInput);
        }
      }
    }
  }
// if (Integer userNumberInput <= 99) {
//   userNumberInput.toCharArray()
//   for (String[] twoDigit : list) {
//
//   }
// }
  return result;

  }
}
