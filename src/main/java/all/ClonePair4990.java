package all;

public class ClonePair4990 {

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

    boolean method2(int i){
      if (i % 4 != 0) {
        return false;
      }
      if (i % 400 == 0) {
        return true;
      }
      if (i % 100 == 0) {
        return false;
      }
      return true;
    }
}
