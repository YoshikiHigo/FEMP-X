package all;

public class ClonePair4118 {

    @SuppressWarnings("null") boolean method1(String[] s1,String[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null && s2 != null)   return false;
      if (s1 != null && s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (!s1[i].equals(s2[i]))     return false;
      }
      return true;
    }

    boolean method2(String[] s1,String[] s2){
      if ((s1 == null) || (s2 == null)) {
        return s1 == s2;
      }
      if (s1.length != s2.length) {
        return false;
      }
      for (int i=0; i < s1.length; i++) {
        if (!s1[i].equals(s2[i])) {
          return false;
        }
      }
      return true;
    }
}
