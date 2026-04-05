package unverified;

public class ClonePair8562 {

    boolean method1(String source,String identifer){
      if (source == null || "".equals(source)) {
        return false;
      }
      if (identifer == null || "".equals(identifer)) {
        return false;
      }
      return source.startsWith(identifer);
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
