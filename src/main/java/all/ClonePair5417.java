package all;

public class ClonePair5417 {

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

    boolean method2(String v1,String v2){
      if (v1 == null && v2 == null)   return false;
      if (v1 == null || v2 == null)   return true;
      return !v1.equals(v2);
    }
}
