package all;

public class ClonePair5339 {

    boolean method1(int yyyy){
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

    boolean method2(int year){
      boolean isDivisibleBy4=(year & 0x3) == 0;
      if (isDivisibleBy4) {
        boolean isCenturyYear=(year % 100 == 0);
        boolean isDivisibleBy400=(year % 400 == 0);
        return !(isCenturyYear && !isDivisibleBy400);
      }
     else {
        return false;
      }
    }
}
