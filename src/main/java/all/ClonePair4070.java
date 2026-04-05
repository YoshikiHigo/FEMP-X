package all;

public class ClonePair4070 {

    boolean method1(String[] one,String[] two){
      if ((one == null) && (two == null))   return true;
      if ((one == null) || (two == null))   return false;
      if (one.length != two.length)   return false;
      for (int i=0; i < one.length; i++) {
        if (!one[i].equals(two[i]))     return false;
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
