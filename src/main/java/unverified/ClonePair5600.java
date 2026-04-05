package unverified;

public class ClonePair5600 {

    boolean method1(int year){
      if (year % 400 == 0) {
        return true;
      }
     else   if (year % 100 == 0) {
        return false;
      }
     else   if (year % 4 == 0) {
        return true;
      }
      return false;
    }

    boolean method2(int y){
      if (y % 100 == 0) {
        return (y % 400 == 0);
      }
      return (y % 4 == 0);
    }
}
