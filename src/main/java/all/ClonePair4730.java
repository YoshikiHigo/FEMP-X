package all;

public class ClonePair4730 {

    boolean method1(int year){
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int year){
      if (year % 4 != 0)   return false;
      if (year % 100 != 0)   return true;
      if (year % 400 == 0)   return true;
     else   return false;
    }
}
