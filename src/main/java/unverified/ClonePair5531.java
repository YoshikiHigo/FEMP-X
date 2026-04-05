package unverified;

public class ClonePair5531 {

    boolean method1(int year){
      boolean result=false;
      if (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0))) {
        result=true;
      }
      return result;
    }

    boolean method2(int year){
      if ((year & 0x03) != 0)   return false;
      if (0 == (year % 100)) {
        if ((year % 400) != 0)     return false;
      }
      return true;
    }
}
