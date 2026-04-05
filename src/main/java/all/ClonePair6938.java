package all;

public class ClonePair6938 {

    boolean method1(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
    }

    boolean method2(String A,String B){
      try {
        final char[] a=A.toCharArray();
        final char[] b=B.toCharArray();
        if (a.length != b.length) {
          return false;
        }
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            return false;
          }
        }
        return true;
      }
     catch (  Exception e) {
        return false;
      }
    }
}
