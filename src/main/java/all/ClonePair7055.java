package all;

public class ClonePair7055 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return (s2 == null || s2.trim().equals("") || s2.equals("\n"));
      if (s2 == null)   return s1.trim().equals("") || s1.equals("\n");
      return s1.trim().equals(s2.trim());
    }

    boolean method2(String a,String b){
      if ((a == null || a.length() == 0) && (b == null || b.length() == 0))   return true;
      if (a == null)   return false;
      return a.equals(b);
    }
}
