package unverified;

public class ClonePair6675 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return s2 == null || s2.equals("");
      if (s2 == null)   return s1.equals("");
      return s1.equals(s2);
    }

    boolean method2(String s1,String s2){
      if (s1 == null)   return (s2 == null || s2.trim().equals("") || s2.equals("\n"));
      if (s2 == null)   return s1.trim().equals("") || s1.equals("\n");
      return s1.trim().equals(s2.trim());
    }
}
