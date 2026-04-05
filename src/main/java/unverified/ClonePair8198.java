package unverified;

public class ClonePair8198 {

    boolean method1(String a,String b){
      if ((a == null && b != null) || (a != null && b == null)) {
        return false;
      }
     else {
        return a == b || a.equals(b);
      }
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null)   return (s1 == s2);
     else   return s1.compareTo(s2) == 0;
    }
}
