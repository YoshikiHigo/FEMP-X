package all;

public class ClonePair5586 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return true;
      if (a == null)   return false;
      if (b == null)   return false;
      if (a.compareTo(b) == 0)   return true;
     else   return false;
    }

    boolean method2(String s1,String s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      return s1.compareToIgnoreCase(s2) == 0;
    }
}
