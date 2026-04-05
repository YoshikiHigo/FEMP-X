package unverified;

public class ClonePair5517 {

    boolean method1(int year){
      boolean result=false;
      if (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0))) {
        result=true;
      }
      return result;
    }

    boolean method2(int year){
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        return true;
      }
      return false;
    }
}
