package unverified;

public class ClonePair12785 {

    String method1(int n){
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

    String method2(int iValue){
      String suffix="th";
      if ((iValue < 4) || (iValue > 20)) {
    switch (iValue % 10) {
    case 1:      suffix="st";
        break;
    case 2:  suffix="nd";
    break;
    case 3:suffix="rd";
    break;
    default:break;
    }
    }
    return Integer.toString(iValue) + suffix;
    }
}
