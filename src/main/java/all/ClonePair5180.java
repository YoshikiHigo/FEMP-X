package all;

public class ClonePair5180 {

    boolean method1(int year){
      if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0))   return true;
     else   return false;
    }

    boolean method2(int yyyy){
      if ((yyyy % 4) != 0) {
        return false;
      }
     else   if ((yyyy % 400) == 0) {
        return true;
      }
     else   if ((yyyy % 100) == 0) {
        return false;
      }
     else {
        return true;
      }
    }
}
