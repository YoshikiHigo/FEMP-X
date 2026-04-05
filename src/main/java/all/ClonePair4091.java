package all;

public class ClonePair4091 {

    boolean method1(String[] s1,String[] s2){
      if (s1.length != s2.length) {
        return false;
      }
     else {
        for (int i=0; i < s1.length; i++) {
          if (!(s1[i].equalsIgnoreCase(s2[i]))) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(String[] r,String[] s){
      int l=r.length;
      if (l == s.length) {
        if (l != 0) {
          for (int i=0; i < l; i++) {
            if (!r[i].equals(s[i])) {
              return false;
            }
          }
        }
        return true;
      }
      return false;
    }
}
