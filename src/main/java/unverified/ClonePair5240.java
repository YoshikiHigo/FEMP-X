package unverified;

public class ClonePair5240 {

    boolean method1(int year){
      if ((year % 100) == 0)   return ((year % 400) == 0);
      return ((year % 4) == 0);
    }

    boolean method2(int year){
      if ((year % 400) == 0)   return true;
     else   if ((year % 4) == 0) {
        if ((year % 100) == 0)     return false;
     else     return true;
      }
     else   return false;
    }
}
