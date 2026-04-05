package unverified;

public class ClonePair4436 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return ((s2 == null) || s2.equals(""));
      if (s2 == null)   return (s1.equals(""));
      return (s1.equalsIgnoreCase(s2));
    }

    boolean method2(String a,String b){
      if ((a == null || a.length() == 0) && (b == null || b.length() == 0))   return true;
      if (a == null)   return false;
      return a.equals(b);
    }
}
