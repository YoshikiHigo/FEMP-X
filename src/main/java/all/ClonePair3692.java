package all;

public class ClonePair3692 {

    boolean method1(String s1,String s2){
      if (s1 == null && s2 == null)   return true;
      if ((s1 == null || s2 == null))   return false;
      if (!s1.equals(s2)) {
        return false;
      }
      return true;
    }

    boolean method2(String oldStr,String newStr){
      if (oldStr == null && newStr != null) {
        return false;
      }
      if (oldStr != null && newStr == null) {
        return false;
      }
      if (oldStr == null && newStr == null) {
        return true;
      }
      if (oldStr.equals(newStr)) {
        return true;
      }
     else {
        return false;
      }
    }
}
