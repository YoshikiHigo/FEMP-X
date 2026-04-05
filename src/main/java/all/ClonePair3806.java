package all;

import java.util.StringTokenizer;

public class ClonePair3806 {

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
