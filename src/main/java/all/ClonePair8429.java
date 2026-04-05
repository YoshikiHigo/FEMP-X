package all;

public class ClonePair8429 {

    boolean method1(String a,String b){
      boolean result=a == null && b == null;
      if (!result) {
        result=a != null && b != null && a.equals(b);
      }
      return result;
    }

    boolean method2(String s1,String s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      return s1.compareToIgnoreCase(s2) == 0;
    }
}
