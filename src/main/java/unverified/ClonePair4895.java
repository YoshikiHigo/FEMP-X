package unverified;

public class ClonePair4895 {

    boolean method1(int year){
      if (year % 4 != 0)   return false;
      if (year % 100 != 0)   return true;
      if (year % 400 == 0)   return true;
     else   return false;
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
