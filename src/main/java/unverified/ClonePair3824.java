package unverified;

public class ClonePair3824 {

    boolean method1(String strA,String strB){
      if ((strA == null) && (strB == null)) {
        return true;
      }
      if ((strA == null) || (strB == null)) {
        return false;
      }
      return (strA.compareToIgnoreCase(strB) == 0);
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null)   return (s1 == s2);
     else   return s1.compareTo(s2) == 0;
    }
}
