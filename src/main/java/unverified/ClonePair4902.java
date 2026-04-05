package unverified;

public class ClonePair4902 {

    boolean method1(int year){
      if (year % 4 != 0)   return false;
      if (year % 100 != 0)   return true;
      if (year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int yearNum){
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
}
