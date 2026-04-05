package unverified;

public class ClonePair4065 {

    boolean method1(String[] a1,String[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i])) {
          return false;
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
