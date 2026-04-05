package all;

public class ClonePair3758 {

    boolean method1(String a,String b){
      if (a != null && a.trim().length() == 0)   a=null;
      if (b != null && b.trim().length() == 0)   b=null;
      boolean rt=false;
      if (a == b)   return true;
      if (a != null && b != null) {
        if (a.compareTo(b) == 0) {
          return true;
        }
      }
      return rt;
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null)   return (s1 == s2);
     else   return s1.compareTo(s2) == 0;
    }
}
