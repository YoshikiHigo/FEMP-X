package unverified;

public class ClonePair5659 {

    boolean method1(String s1,String s2,boolean ignore){
      if (s1 == s2)   return true;
      if (s1 == null || s2 == null)   return false;
      if (ignore)   return s1.equalsIgnoreCase(s2);
     else   return s1.equals(s2);
    }

    boolean method2(String str1,String str2,boolean ignoreCase){
      if (str1 == null) {
        return (str2 == null);
      }
      if (str2 == null) {
        return false;
      }
      if (ignoreCase) {
        return str1.equalsIgnoreCase(str2);
      }
     else {
        return str1.equals(str2);
      }
    }
}
