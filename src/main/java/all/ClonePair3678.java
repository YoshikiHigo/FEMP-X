package all;

import java.util.StringTokenizer;

public class ClonePair3678 {

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
