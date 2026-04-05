package all;

public class ClonePair3680 {

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

    boolean method2(String simTypePattern,String simulationType){
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
}
