package unverified;

public class ClonePair5267 {

    boolean method1(int year){
      if (year <= 1752) {
        int r=year % 4;
        if (r == 0) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        if (year % 400 == 0) {
          return true;
        }
     else {
          if (year % 100 == 0) {
            return false;
          }
     else {
            return (year % 4 == 0) ? true : false;
          }
        }
      }
    }

    boolean method2(int year){
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)   return true;
      return false;
    }
}
