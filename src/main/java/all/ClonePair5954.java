package all;

public class ClonePair5954 {

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
