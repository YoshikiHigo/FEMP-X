package unverified;

public class ClonePair7907 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return false;
      if (a == null)   return true;
      if (b == null)   return true;
      return (a.compareTo(b) != 0);
    }

    boolean method2(String v1,String v2){
      if (v1 == null && v2 == null)   return false;
      if (v1 == null || v2 == null)   return true;
      return !v1.equals(v2);
    }
}
