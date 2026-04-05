package all;

public class ClonePair4976 {

    boolean method1(int year){
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

    boolean method2(int year){
      if (year % 4 != 0)   return false;
      if (year % 400 == 0)   return true;
      return year % 100 != 0;
    }
}
