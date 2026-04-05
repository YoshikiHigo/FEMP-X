package unverified;

public class ClonePair9602 {

    boolean method1(char[] a1,char[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
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
