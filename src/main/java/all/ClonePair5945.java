package all;

public class ClonePair5945 {

    boolean method1(String r,String c){
      if (r == null && c == null) {
        return false;
      }
      if (r != null && c != null) {
        return !r.equals(c);
      }
      return true;
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
