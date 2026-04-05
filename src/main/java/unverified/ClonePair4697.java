package unverified;

public class ClonePair4697 {

    boolean method1(int year){
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int year){
      if ((year & 0x03) != 0)   return false;
      if (0 == (year % 100)) {
        if ((year % 400) != 0)     return false;
      }
      return true;
    }
}
