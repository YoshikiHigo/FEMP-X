package all;

import java.util.StringTokenizer;

public class ClonePair3797 {

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

    boolean method2(String fileName,String extension){
      boolean check=false;
      if (fileName != null && extension != null && fileName.length() > extension.length()) {
        fileName=fileName.toLowerCase();
        extension=extension.toLowerCase();
        try {
          if (fileName.contains(extension) && fileName.lastIndexOf(extension) == fileName.length() - extension.length()) {
            check=true;
          }
        }
     catch (    final Exception e) {
          check=false;
        }
      }
      return check;
    }
}
