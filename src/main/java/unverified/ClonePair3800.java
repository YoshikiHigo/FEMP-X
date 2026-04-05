package unverified;

import java.util.StringTokenizer;

public class ClonePair3800 {

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

    boolean method2(String str,String suffix){
      if (str == null || suffix == null) {
        return false;
      }
      if (str.endsWith(suffix)) {
        return true;
      }
      if (str.length() < suffix.length()) {
        return false;
      }
      String lcStr=str.substring(str.length() - suffix.length()).toLowerCase();
      String lcSuffix=suffix.toLowerCase();
      return lcStr.equals(lcSuffix);
    }
}
