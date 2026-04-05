package all;

public class ClonePair4523 {

    boolean method1(int year){
      if ((year % 4 == 0) && (year % 100 != 0))   return true;
      if (year % 400 == 0)   return true;
      return false;
    }

    boolean method2(int year){
      boolean leap=false;
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            leap=true;
          }
        }
     else {
          leap=true;
        }
      }
      return leap;
    }
}
