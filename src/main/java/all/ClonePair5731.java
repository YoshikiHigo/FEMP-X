package all;

public class ClonePair5731 {

    boolean method1(int y){
      if (y % 100 == 0) {
        return (y % 400 == 0);
      }
      return (y % 4 == 0);
    }

    boolean method2(int year){
      if ((year % 400) == 0)   return true;
     else   if ((year % 4) == 0) {
        if ((year % 100) == 0)     return false;
     else     return true;
      }
     else   return false;
    }
}
