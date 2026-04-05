package unverified;

import java.util.StringTokenizer;

public class ClonePair3717 {

    boolean method1(String theString,String firstToken){
      boolean result=false;
      if ((theString != null) && (firstToken != null)) {
        StringTokenizer st=new StringTokenizer(theString);
        result=(st.hasMoreTokens() && (st.nextToken().compareTo(firstToken) == 0));
      }
      return result;
    }

    boolean method2(String source,String identifer){
      if (source == null || "".equals(source)) {
        return false;
      }
      if (identifer == null || "".equals(identifer)) {
        return false;
      }
      return source.startsWith(identifer);
    }
}
