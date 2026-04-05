package all;

public class ClonePair7077 {

    String method1(int num){
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

    String method2(int day){
      int lasti=day % 10;
      if (day > 3 && day < 21) {
        return "th";
      }
     else   if (lasti == 1) {
        return "st";
      }
     else   if (lasti == 2) {
        return "nd";
      }
     else   if (lasti == 3) {
        return "rd";
      }
      return "th";
    }
}
