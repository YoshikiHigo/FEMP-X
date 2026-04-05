package all;

import java.util.StringTokenizer;

public class ClonePair3718 {

    boolean method1(String theString,String firstToken){
      boolean result=false;
      if ((theString != null) && (firstToken != null)) {
        StringTokenizer st=new StringTokenizer(theString);
        result=(st.hasMoreTokens() && (st.nextToken().compareTo(firstToken) == 0));
      }
      return result;
    }

    boolean method2(String p1,String p2){
      if (p1 != null && p1.length() == 0)   p1=null;
      if (p2 != null && p2.length() == 0)   p2=null;
      return (p1 != null && p2 != null && p1.equals(p2));
    }
}
