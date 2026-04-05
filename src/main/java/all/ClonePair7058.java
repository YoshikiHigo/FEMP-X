package all;

public class ClonePair7058 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return (s2 == null || s2.trim().equals("") || s2.equals("\n"));
      if (s2 == null)   return s1.trim().equals("") || s1.equals("\n");
      return s1.trim().equals(s2.trim());
    }

    boolean method2(String actual,String expected){
      if (actual == null)   return (expected == null || expected.trim().equals("") || expected.equals("\n"));
      if (expected == null)   return actual.trim().equals("") || actual.equals("\n");
      if (expected.equals("IGNORE"))   return true;
      return actual.trim().equals(expected.trim());
    }
}
