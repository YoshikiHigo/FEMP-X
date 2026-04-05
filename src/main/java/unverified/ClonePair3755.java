package unverified;

public class ClonePair3755 {

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

    boolean method2(String actual,String expected){
      if (actual == null)   return (expected == null || expected.trim().equals("") || expected.equals("\n"));
      if (expected == null)   return actual.trim().equals("") || actual.equals("\n");
      if (expected.equals("IGNORE"))   return true;
      return actual.trim().equals(expected.trim());
    }
}
