package unverified;

import java.util.*;

public class ClonePair8277 {

    boolean method1(String src,String substring){
      if (src == null || "".equals(src)) {
        return false;
      }
      if (substring == null || "".equals(substring)) {
        return false;
      }
      StringTokenizer sS=new StringTokenizer(src,",");
      while (sS.hasMoreTokens()) {
        if (substring.equals(sS.nextElement()))     return true;
      }
      return false;
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
