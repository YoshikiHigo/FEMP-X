package unverified;

public class ClonePair5837 {

    boolean method1(int year){
      boolean leapYear;
      if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
        leapYear=true;
      }
     else {
        leapYear=false;
      }
      return leapYear;
    }

    boolean method2(int year){
      if ((year & 0x03) != 0)   return false;
      if (0 == (year % 100)) {
        if ((year % 400) != 0)     return false;
      }
      return true;
    }
}
