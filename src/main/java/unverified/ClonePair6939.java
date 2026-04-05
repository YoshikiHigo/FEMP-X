package unverified;

import java.util.*;

public class ClonePair6939 {

    boolean method1(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
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
