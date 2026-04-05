package all;

public class ClonePair5656 {

    boolean method1(String s1,String s2,boolean ignore){
      if (s1 == s2)   return true;
      if (s1 == null || s2 == null)   return false;
      if (ignore)   return s1.equalsIgnoreCase(s2);
     else   return s1.equals(s2);
    }

    boolean method2(String s1,String s2,boolean ignoreCase){
      if (s1 == null && s2 == null) {
        return true;
      }
      if (s1 != null && s2 != null) {
        return ignoreCase ? s1.equalsIgnoreCase(s2) : s1.equals(s2);
      }
      return false;
    }
}
