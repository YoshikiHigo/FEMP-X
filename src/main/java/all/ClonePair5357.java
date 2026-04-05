package all;

public class ClonePair5357 {

    boolean method1(int y){
      if (y % 100 == 0)   return (y % 400 == 0);
     else   return (y % 4 == 0);
    }

    boolean method2(int year){
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        return true;
      }
      return false;
    }
}
