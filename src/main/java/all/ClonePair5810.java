package all;

public class ClonePair5810 {

    boolean method1(int year){
      if ((year % 400) == 0)   return true;
     else   if ((year % 4) == 0) {
        if ((year % 100) == 0)     return false;
     else     return true;
      }
     else   return false;
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
