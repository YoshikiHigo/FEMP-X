package unverified;

public class ClonePair12781 {

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
