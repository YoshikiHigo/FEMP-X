package all;

public class ClonePair5709 {

    boolean method1(int year){
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        return true;
      }
      return false;
    }

    boolean method2(int year){
      if (year >= 1582) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
      }
     else {
        return (year % 4 == 0);
      }
    }
}
