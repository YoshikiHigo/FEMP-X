package unverified;

public class ClonePair5343 {

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
      boolean leapYear;
      if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
        leapYear=true;
      }
     else {
        leapYear=false;
      }
      return leapYear;
    }
}
