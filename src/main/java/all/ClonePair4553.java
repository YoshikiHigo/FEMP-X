package all;

public class ClonePair4553 {

    boolean method1(int year){
      if ((year % 4 == 0) && (year % 100 != 0))   return true;
      if (year % 400 == 0)   return true;
      return false;
    }

    boolean method2(int y){
      if (y % 100 == 0) {
        return (y % 400 == 0);
      }
      return (y % 4 == 0);
    }
}
