package unverified;

public class ClonePair12787 {

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

    String method2(int number){
      int modulo=number % 100;
      if (modulo >= 11 && modulo <= 13)   return number + "th";
    switch (number % 10) {
    case 1:    return number + "st";
    case 2:  return number + "nd";
    case 3:return number + "rd";
    default:return number + "th";
    }
    }
}
