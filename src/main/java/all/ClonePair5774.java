package all;

public class ClonePair5774 {

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
      if (year % 4 == 0) {
        if (year < 1583)     return true;
     else {
          if ((year % 100 == 0) && (year % 400 != 0))       return false;
     else       return true;
        }
      }
     else {
        return false;
      }
    }
}
