package all;

public class ClonePair11549 {

    String method1(int i){
      String result="" + i;
      if (i > 3 && i < 20) {
        result+="th";
      }
     else   if (i % 10 == 1) {
        result+="st";
      }
     else   if (i % 10 == 2) {
        result+="nd";
      }
     else   if (i % 10 == 3) {
        result+="rd";
      }
     else {
        result+="th";
      }
      return result;
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
