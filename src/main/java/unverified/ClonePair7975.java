package unverified;

public class ClonePair7975 {

    boolean method1(String a,String b){
      if ((a == null || a.length() == 0) && (b == null || b.length() == 0))   return true;
      if (a == null)   return false;
      return a.equals(b);
    }

    boolean method2(String string1,String string2){
      if (string1 == null) {
        return string2 == null || string2.length() == 0;
      }
      if (string2 == null) {
        return string1.length() == 0;
      }
      return string1.equals(string2);
    }
}
