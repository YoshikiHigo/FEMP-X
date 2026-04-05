package unverified;

public class ClonePair5368 {

    boolean method1(int y){
      if (y % 100 == 0)   return (y % 400 == 0);
     else   return (y % 4 == 0);
    }

    boolean method2(int year){
      boolean flag=false;
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        flag=true;
      }
      return flag;
    }
}
