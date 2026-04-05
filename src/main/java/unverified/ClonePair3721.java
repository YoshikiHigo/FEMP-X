package unverified;

import java.util.StringTokenizer;

public class ClonePair3721 {

    boolean method1(String theString,String firstToken){
      boolean result=false;
      if ((theString != null) && (firstToken != null)) {
        StringTokenizer st=new StringTokenizer(theString);
        result=(st.hasMoreTokens() && (st.nextToken().compareTo(firstToken) == 0));
      }
      return result;
    }

    boolean method2(String s,String start){
      if ((s == null) || (start == null)) {
        return false;
      }
      if (start.length() > s.length()) {
        return false;
      }
      String temp=s.substring(0,start.length());
      if (temp.equalsIgnoreCase(start)) {
        return true;
      }
     else {
        return false;
      }
    }
}
