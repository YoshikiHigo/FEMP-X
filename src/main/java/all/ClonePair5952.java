package all;

public class ClonePair5952 {

    String method1(int value){
      int hundredRemainder=value % 100;
      int tenRemainder=value % 10;
      if (hundredRemainder - tenRemainder == 10) {
        return "th";
      }
    switch (tenRemainder) {
    case 1:    return "st";
    case 2:  return "nd";
    case 3:return "rd";
    default:return "th";
    }
    }

    String method2(int num){
      if (num < 1) {
        return "th";
      }
      if (num == 1) {
        return "st";
      }
      if ((num > 10) && (num < 20)) {
        return "th";
      }
      int digit=num % 10;
      if (digit == 1) {
        return "st";
      }
      if (digit == 2) {
        return "nd";
      }
      if (digit == 3) {
        return "rd";
      }
      return "th";
    }
}
