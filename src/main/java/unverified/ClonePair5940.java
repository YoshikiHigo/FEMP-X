package unverified;

public class ClonePair5940 {

    boolean method1(String r,String c){
      if (r == null && c == null) {
        return false;
      }
      if (r != null && c != null) {
        return !r.equals(c);
      }
      return true;
    }

    boolean method2(String oldString,String newString){
      if (oldString == null && newString == null) {
        return false;
      }
     else   if (oldString == null || newString == null) {
        return true;
      }
     else {
        return !oldString.equals(newString);
      }
    }
}
