package unverified;

public class ClonePair5414 {

    boolean method1(int year){
      if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0))   return true;
      return false;
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
