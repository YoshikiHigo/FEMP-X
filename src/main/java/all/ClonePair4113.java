package all;

public class ClonePair4113 {

    boolean method1(String[] strings1,String[] strings2){
      if (strings1.length != strings2.length)   return false;
      for (int i=0; i < strings1.length; ++i)   if (!strings1[i].equals(strings2[i]))   return false;
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
