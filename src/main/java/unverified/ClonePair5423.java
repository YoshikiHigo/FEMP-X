package unverified;

public class ClonePair5423 {

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

    boolean method2(String oldValue,String newValue){
      boolean changed=false;
      if (oldValue == null) {
        if (newValue != null) {
          changed=true;
        }
      }
     else   if (newValue == null) {
        changed=true;
      }
     else   if (!oldValue.equals(newValue)) {
        changed=true;
      }
      return changed;
    }
}
