package unverified;

public class ClonePair11545 {

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

    String method2(int num){
      String suffix="th";
    switch (num % 10) {
    case 1:    if (num % 100 != 11)     suffix="st";
      break;
    case 2:if (num % 100 != 12) suffix="nd";
    break;
    case 3:if (num % 100 != 13) suffix="rd";
    break;
    }
    return num + suffix;
    }
}
