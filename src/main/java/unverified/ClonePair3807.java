package unverified;

import java.util.StringTokenizer;

public class ClonePair3807 {

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

    boolean method2(String value,String suffix){
      if ((value == null) || (suffix == null)) {
        return false;
      }
      if (suffix.length() > value.length()) {
        return false;
      }
      return value.substring(value.length() - suffix.length()).equals(suffix);
    }
}
