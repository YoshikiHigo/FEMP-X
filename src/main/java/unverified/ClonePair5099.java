package unverified;

public class ClonePair5099 {

    boolean method1(int year){
      if (year % 4 != 0) {
        return false;
      }
     else {
        if ((year % 100 == 0) && (year % 400 != 0))     return false;
     else     return true;
      }
    }

    boolean method2(int y){
      if (y % 100 == 0)   return (y % 400 == 0);
     else   return (y % 4 == 0);
    }
}
