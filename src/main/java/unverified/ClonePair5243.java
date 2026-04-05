package unverified;

public class ClonePair5243 {

    boolean method1(int year){
      if ((year % 100) == 0)   return ((year % 400) == 0);
      return ((year % 4) == 0);
    }

    boolean method2(int year){
      boolean flag=false;
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        flag=true;
      }
      return flag;
    }
}
