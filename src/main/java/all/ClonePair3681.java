package all;

public class ClonePair3681 {

    boolean method1(String source,String target){
      if (source == null || target == null) {
        return false;
      }
      if (source.length() != target.length()) {
        return false;
      }
      char[] sc=source.toCharArray();
      char[] tc=target.toCharArray();
      for (int i=0; i < sc.length; i++) {
        if (sc[i] != tc[i]) {
          return false;
        }
      }
      return true;
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
