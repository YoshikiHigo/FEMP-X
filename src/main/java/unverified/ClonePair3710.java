package unverified;

import java.util.StringTokenizer;

public class ClonePair3710 {

    boolean method1(String theString,String firstToken){
      boolean result=false;
      if ((theString != null) && (firstToken != null)) {
        StringTokenizer st=new StringTokenizer(theString);
        result=(st.hasMoreTokens() && (st.nextToken().compareTo(firstToken) == 0));
      }
      return result;
    }

    boolean method2(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
    }
}
