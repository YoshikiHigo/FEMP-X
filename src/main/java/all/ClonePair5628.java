package all;

public class ClonePair5628 {

    boolean method1(int i){
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

    boolean method2(int year){
      if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
        return true;
      }
      return false;
    }
}
