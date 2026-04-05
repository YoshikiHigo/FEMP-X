package unverified;

public class ClonePair7059 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return (s2 == null || s2.trim().equals("") || s2.equals("\n"));
      if (s2 == null)   return s1.trim().equals("") || s1.equals("\n");
      return s1.trim().equals(s2.trim());
    }

    boolean method2(String str1,String str2){
      if (str1 == null || str1.length() == 0) {
        if (str2 == null || str2.length() == 0) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        if (str2 == null) {
          return false;
        }
     else {
          return str1.equals(str2);
        }
      }
    }
}
