package unverified;

public class ClonePair8668 {

    boolean method1(String oldValue,String newValue){
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

    boolean method2(String str1,String str2){
      if ((str1 == null) && (str2 == null))   return false;
      if (str1 == null)   return true;
      if (str2 == null)   return true;
      return !str1.equals(str2);
    }
}
