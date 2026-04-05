package unverified;

public class ClonePair6788 {

    String method1(int num){
      int ones=num % 10;
      int tens=num % 100;
      String suffix=null;
    switch (ones) {
    case 1:    if (tens == 11)     suffix="th";
     else     suffix="st";
      break;
    case 2:if (tens == 12) suffix="th";
     else suffix="nd";
    break;
    case 3:if (tens == 13) suffix="th";
     else suffix="rd";
    break;
    default:suffix="th";
    }
    return num + suffix;
    }

    String method2(int n){
      if (n % 10 == 1 && n % 100 != 11) {
        return n + "st";
      }
      if (n % 10 == 2 && n % 100 != 12) {
        return n + "nd";
      }
      if (n % 10 == 3 && n % 100 != 13) {
        return n + "rd";
      }
      return n + "th";
    }
}
