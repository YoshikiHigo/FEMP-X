package unverified;

public class ClonePair9765 {

    boolean method1(char[] a,char[] b){
      if (null == a) {
        if (null == b)     return true;
     else     return false;
      }
     else   if (null == b)   return false;
     else {
        if (a.length == b.length) {
          for (int cc=0, count=a.length; cc < count; cc++) {
            if (a[cc] != b[cc])         return false;
          }
          return true;
        }
     else     return false;
      }
    }

    boolean method2(char[] first,char[] second){
      if (first == second) {
        return true;
      }
      if (first == null || second == null) {
        return false;
      }
      if (first.length != second.length) {
        return false;
      }
      for (int i=first.length; --i >= 0; ) {
        if (first[i] != second[i]) {
          return false;
        }
      }
      return true;
    }
}
