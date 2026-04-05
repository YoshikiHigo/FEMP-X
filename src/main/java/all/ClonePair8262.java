package all;

public class ClonePair8262 {

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

    boolean method2(String pStrValue,String pStrMask){
      if (pStrValue == null || pStrMask == null) {
        return false;
      }
      if (pStrValue.length() != pStrMask.length()) {
        return false;
      }
      for (int i=0; i < pStrMask.length(); i++) {
        if (pStrMask.charAt(i) == '?') {
          continue;
        }
        if (pStrMask.charAt(i) != pStrValue.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
