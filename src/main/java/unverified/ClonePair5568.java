package unverified;

public class ClonePair5568 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return true;
      if (a == null)   return false;
      if (b == null)   return false;
      if (a.compareTo(b) == 0)   return true;
     else   return false;
    }

    boolean method2(String a,String b){
      boolean result=a == null && b == null;
      if (!result) {
        result=a != null && b != null && a.equals(b);
      }
      return result;
    }
}
