package all;

public class ClonePair6686 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return s2 == null || s2.equals("");
      if (s2 == null)   return s1.equals("");
      return s1.equals(s2);
    }

    boolean method2(String str1,String str2){
      if (str1 == null || str1.length() == 0) {
        if (str2 == null || str2.length() == 0)     return true;
     else     return false;
      }
     else {
        if (str2 == null)     return false;
     else     return str1.equals(str2);
      }
    }
}
