package all;

public class ClonePair8667 {

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
      if (str1 == null)   return str2 != null;
      if (str2 == null)   return str1 != null;
      return !str1.equals(str2);
    }
}
