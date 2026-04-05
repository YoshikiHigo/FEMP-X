package all;

public class ClonePair6785 {

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
      String st=Integer.toString(n);
      if (((n % 100) >= 11) && ((n % 100) <= 13)) {
        return st + "th";
      }
     else   if (n % 10 == 1) {
        return st + "st";
      }
     else   if (n % 10 == 2) {
        return st + "nd";
      }
     else   if (n % 10 == 3) {
        return st + "rd";
      }
     else {
        return st + "th";
      }
    }
}
