package unverified;

public class ClonePair5332 {

    boolean method1(int yyyy){
      if ((yyyy % 4) != 0) {
        return false;
      }
     else   if ((yyyy % 400) == 0) {
        return true;
      }
     else   if ((yyyy % 100) == 0) {
        return false;
      }
     else {
        return true;
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
