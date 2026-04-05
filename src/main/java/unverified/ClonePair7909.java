package unverified;

public class ClonePair7909 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return false;
      if (a == null)   return true;
      if (b == null)   return true;
      return (a.compareTo(b) != 0);
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
