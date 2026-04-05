package unverified;

public class ClonePair5773 {

    boolean method1(int yearNum){
      boolean isLeep=false;
      if ((yearNum % 4 == 0) && (yearNum % 100 != 0)) {
        isLeep=true;
      }
     else   if (yearNum % 400 == 0) {
        isLeep=true;
      }
     else {
        isLeep=false;
      }
      return isLeep;
    }

    boolean method2(int year){
      if ((year & 0x03) != 0)   return false;
      if (0 == (year % 100)) {
        if ((year % 400) != 0)     return false;
      }
      return true;
    }
}
