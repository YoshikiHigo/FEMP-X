package unverified;

import java.util.*;

public class ClonePair7669 {

    boolean method1(String s1,String s2){
      if (s1 == null || s2 == null) {
        return false;
      }
     else {
        return ((s1.length() == s2.length()) && s1.regionMatches(true,0,s2,0,s1.length()));
      }
    }

    boolean method2(String src,String substring){
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
}
