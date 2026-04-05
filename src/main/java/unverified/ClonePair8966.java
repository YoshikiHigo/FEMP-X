package unverified;

public class ClonePair8966 {

    boolean method1(String simTypePattern,String simulationType){
      int len=simTypePattern != null ? simTypePattern.length() : 0;
      if (len == 0) {
        return false;
      }
     else   if (simTypePattern.charAt(len - 1) == '*') {
        return simulationType != null && simulationType.regionMatches(0,simTypePattern,0,len - 1);
      }
     else {
        return simTypePattern.equals(simulationType);
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
