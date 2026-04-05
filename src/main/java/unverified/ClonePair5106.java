package unverified;

public class ClonePair5106 {

    boolean method1(int year){
      if (year % 4 != 0) {
        return false;
      }
     else {
        if ((year % 100 == 0) && (year % 400 != 0))     return false;
     else     return true;
      }
    }

    boolean method2(int year){
      if (year % 400 == 0) {
        return true;
      }
     else   if (year % 100 == 0) {
        return false;
      }
     else   if (year % 4 == 0) {
        return true;
      }
      return false;
    }
}
