package unverified;

public class ClonePair5551 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return true;
      if (a == null)   return false;
      if (b == null)   return false;
      if (a.compareTo(b) == 0)   return true;
     else   return false;
    }

    boolean method2(String a,String b){
      if ((a == null && b != null) || (a != null && b == null)) {
        return false;
      }
     else {
        return a == b || a.equals(b);
      }
    }
}
