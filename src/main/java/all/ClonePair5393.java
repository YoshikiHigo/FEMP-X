package all;

public class ClonePair5393 {

    boolean method1(String oldString,String newString){
      if (oldString == null && newString == null) {
        return false;
      }
     else   if ((oldString == null && newString != null) || (oldString != null && newString == null)) {
        return true;
      }
     else {
        return !oldString.equals(newString);
      }
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
