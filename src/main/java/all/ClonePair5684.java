package all;

public class ClonePair5684 {

    boolean method1(String s1,String s2,boolean trim){
      if (s1 == null && s2 == null) {
        return true;
      }
      if (s1 == null || s2 == null) {
        return false;
      }
      if (trim) {
        return s1.trim().equals(s2.trim());
      }
      return s1.equals(s2);
    }

    boolean method2(String s1,String s2,boolean ignoreCase){
      if (s1 == null) {
        return (s2 == null);
      }
     else   if (s2 == null) {
        return false;
      }
     else {
        return (ignoreCase) ? s1.equalsIgnoreCase(s2) : s1.equals(s2);
      }
    }
}
