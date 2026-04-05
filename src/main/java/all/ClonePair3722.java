package all;

import java.util.StringTokenizer;

public class ClonePair3722 {

    boolean method1(String theString,String firstToken){
      boolean result=false;
      if ((theString != null) && (firstToken != null)) {
        StringTokenizer st=new StringTokenizer(theString);
        result=(st.hasMoreTokens() && (st.nextToken().compareTo(firstToken) == 0));
      }
      return result;
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
