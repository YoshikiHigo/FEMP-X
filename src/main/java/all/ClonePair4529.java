package all;

public class ClonePair4529 {

    boolean method1(int year){
      if ((year % 4 == 0) && (year % 100 != 0))   return true;
      if (year % 400 == 0)   return true;
      return false;
    }

    boolean method2(int year){
      if ((year % 100) == 0)   return ((year % 400) == 0);
      return ((year % 4) == 0);
    }
}
