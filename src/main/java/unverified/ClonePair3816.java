package unverified;

public class ClonePair3816 {

    boolean method1(String strA,String strB){
      if ((strA == null) && (strB == null)) {
        return true;
      }
      if ((strA == null) || (strB == null)) {
        return false;
      }
      return (strA.compareToIgnoreCase(strB) == 0);
    }

    boolean method2(String str1,String str2){
      boolean match=false;
      if (str1 == null && str2 == null) {
        match=true;
      }
     else   if (str1 == null || str2 == null) {
        match=false;
      }
     else   if (str1.equals(str2)) {
        match=true;
      }
      return match;
    }
}
