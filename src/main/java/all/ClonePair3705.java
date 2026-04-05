package all;

import java.util.StringTokenizer;

public class ClonePair3705 {

    boolean method1(String theString,String firstToken){
      boolean result=false;
      if ((theString != null) && (firstToken != null)) {
        StringTokenizer st=new StringTokenizer(theString);
        result=(st.hasMoreTokens() && (st.nextToken().compareTo(firstToken) == 0));
      }
      return result;
    }

    boolean method2(String fileName,String fileExtensions){
      if (fileExtensions == null || fileName == null) {
        return false;
      }
      String[] arr=fileExtensions.toUpperCase().split(" ");
      fileName=fileName.toUpperCase();
      for (  String elem : arr) {
        if (!"".equals(elem) && fileName.endsWith(elem)) {
          return true;
        }
      }
      return false;
    }
}
