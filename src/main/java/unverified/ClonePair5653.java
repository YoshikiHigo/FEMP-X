package unverified;

public class ClonePair5653 {

    boolean method1(String s1,String s2,boolean ignore){
      if (s1 == s2)   return true;
      if (s1 == null || s2 == null)   return false;
      if (ignore)   return s1.equalsIgnoreCase(s2);
     else   return s1.equals(s2);
    }

    boolean method2(String s1,String s2,boolean trim){
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
}
