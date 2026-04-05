package unverified;

public class ClonePair8260 {

    boolean method1(String A,String B){
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

    boolean method2(String source,String identifer){
      if (source == null || "".equals(source)) {
        return false;
      }
      if (identifer == null || "".equals(identifer)) {
        return false;
      }
      return source.startsWith(identifer);
    }
}
