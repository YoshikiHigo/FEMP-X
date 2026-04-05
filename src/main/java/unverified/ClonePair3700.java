package unverified;

public class ClonePair3700 {

    boolean method1(String s1,String s2){
      if (s1 == null && s2 == null)   return true;
      if ((s1 == null || s2 == null))   return false;
      if (!s1.equals(s2)) {
        return false;
      }
      return true;
    }

    boolean method2(String stringA,String stringB){
      if (stringA == null) {
        if (stringB == null) {
          return true;
        }
     else {
          return false;
        }
      }
      if (stringB == null)   return false;
      if (stringA.compareTo(stringB) == 0) {
        return true;
      }
     else {
        return false;
      }
    }
}
