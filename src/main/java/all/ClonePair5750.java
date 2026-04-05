package all;

public class ClonePair5750 {

    boolean method1(String str,boolean allowSign){
      int i=0;
      if (str.length() == 0) {
        return false;
      }
      if (str.charAt(0) == '+' || str.charAt(0) == '-') {
        i=1;
      }
      for (; i < str.length(); i++) {
        if (str.charAt(i) < '0' || str.charAt(i) > '9') {
          return false;
        }
      }
      return true;
    }

    boolean method2(String str,boolean allowSign){
      int i=0;
      if (str.length() == 0)   return false;
      if (str.charAt(0) == '+' || str.charAt(0) == '-')   i=1;
      for (; i < str.length(); i++) {
        if (str.charAt(i) < '0' || str.charAt(i) > '9')     return false;
      }
      return true;
    }
}
