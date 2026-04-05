package all;

public class ClonePair5710 {

    boolean method1(int year){
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        return true;
      }
      return false;
    }

    boolean method2(int number){
      String s=Integer.toString(number);
      if (s.endsWith("1")) {
        return false;
      }
     else   if (s.endsWith("3")) {
        return false;
      }
     else   if (s.endsWith("5")) {
        return false;
      }
     else   if (s.endsWith("7")) {
        return false;
      }
     else   if (s.endsWith("9")) {
        return false;
      }
     else {
        return true;
      }
    }
}
