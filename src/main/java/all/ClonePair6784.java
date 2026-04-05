package all;

public class ClonePair6784 {

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
