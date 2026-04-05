package unverified;

public class ClonePair4748 {

    boolean method1(int year){
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int year){
      if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
        return true;
      }
     else {
        return false;
      }
    }
}
