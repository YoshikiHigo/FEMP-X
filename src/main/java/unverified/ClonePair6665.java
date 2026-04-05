package unverified;

import java.util.*;

public class ClonePair6665 {

    boolean method1(String value1,String value2){
      try {
        if (value1 == null || value2 == null) {
          return false;
        }
     else     if (value1.trim().length() == 0 || value2.trim().length() == 0) {
          return false;
        }
     else {
          return value1.equals(value2);
        }
      }
     catch (  Exception e) {
        return false;
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
