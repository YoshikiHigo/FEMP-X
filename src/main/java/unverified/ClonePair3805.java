package unverified;

import java.util.StringTokenizer;

public class ClonePair3805 {

    boolean method1(String style,String aStyleProperty){
      if (style == null || aStyleProperty == null) {
        return false;
      }
      String lowerStyle=style.toLowerCase();
      String lowerProperty=aStyleProperty.toLowerCase();
      if (lowerStyle.indexOf(lowerProperty) < 0) {
        return false;
      }
      StringTokenizer st=new StringTokenizer(lowerStyle,";");
      while (st.hasMoreTokens()) {
        if (st.nextToken().trim().startsWith(lowerProperty)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String s,String end){
      if ((s == null) || (end == null))   return false;
      if (end.length() > s.length())   return false;
      String temp=s.substring(s.length() - end.length(),s.length());
      if (temp.equalsIgnoreCase(end))   return true;
     else   return false;
    }
}
