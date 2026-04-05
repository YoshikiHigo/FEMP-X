package all;

import java.util.StringTokenizer;

public class ClonePair3060 {

    String[] method1(String string,String delimiters){
      if (string != null && string.length() > 0) {
        StringTokenizer tokenizer=new StringTokenizer(string,delimiters);
        String[] result=new String[tokenizer.countTokens()];
        int i=0;
        while (tokenizer.hasMoreTokens()) {
          result[i]=tokenizer.nextToken();
          i++;
        }
        return result;
      }
     else {
        return null;
      }
    }

    String[] method2(String strSrc,String seperator){
      String[] arr=null;
      if (strSrc == null || strSrc.equals(""))   return arr;
      StringTokenizer tokenizer=new StringTokenizer(strSrc,seperator);
      arr=new String[tokenizer.countTokens()];
      int i=0;
      while (tokenizer.hasMoreTokens()) {
        arr[i]=tokenizer.nextToken();
        i++;
      }
      return arr;
    }
}
