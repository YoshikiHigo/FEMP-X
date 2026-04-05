package all;

public class ClonePair4122 {

    boolean method1(String[] r,String[] s){
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

    boolean method2(String[] s1,String[] s2){
      boolean equal=true;
      int index=0;
      if (s1.length == s2.length) {
        while ((index < s1.length) && (equal)) {
          if (s1[index].equals(s2[index])) {
            index++;
          }
     else {
            equal=false;
          }
        }
        if (index == s1.length)     return true;
     else     return false;
      }
     else {
        return false;
      }
    }
}
