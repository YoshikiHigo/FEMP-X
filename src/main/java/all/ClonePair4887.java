package all;

public class ClonePair4887 {

    boolean method1(int year){
      if (year % 4 != 0)   return false;
      if (year % 100 != 0)   return true;
      if (year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int y){
      if (y % 100 == 0)   return (y % 400 == 0);
     else   return (y % 4 == 0);
    }
}
