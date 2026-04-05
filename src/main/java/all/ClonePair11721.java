package all;

public class ClonePair11721 {

    String method1(int num){
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
