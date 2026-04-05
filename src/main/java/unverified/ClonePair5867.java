package unverified;

public class ClonePair5867 {

    boolean method1(int year){
      boolean flag=false;
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        flag=true;
      }
      return flag;
    }

    boolean method2(int year){
      if (year % 4 == 0 && year % 100 != 0) {
        return true;
      }
      if (year % 400 == 0) {
        return true;
      }
      return false;
    }
}
