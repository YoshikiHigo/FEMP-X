package unverified;

public class ClonePair7093 {

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

    String method2(int i){
      String out;
      if (i % 100 <= 20 && i >= 4) {
        out="th";
      }
     else {
    switch (i % 10) {
    case 1:      out="st";
        break;
    case 2:  out="nd";
    break;
    case 3:out="rd";
    break;
    default:out="th";
    break;
    }
    }
    return (out);
    }
}
