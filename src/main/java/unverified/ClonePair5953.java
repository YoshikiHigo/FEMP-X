package unverified;

public class ClonePair5953 {

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
