package unverified;

public class ClonePair3827 {

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
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      return s1.compareToIgnoreCase(s2) == 0;
    }
}
