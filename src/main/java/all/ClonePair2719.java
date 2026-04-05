package all;

import java.util.StringTokenizer;

public class ClonePair2719 {

    String[] method1(String str,String strDelim){
      if (str == null || str.length() == 0)   return null;
      StringTokenizer st=new StringTokenizer(str,strDelim);
      String[] arrToken=new String[st.countTokens()];
      for (int i=0; i < arrToken.length; i++)   arrToken[i]=st.nextToken();
      return (arrToken.length == 0) ? null : arrToken;
    }

    String[] method2(String input,String delimiter){
      String strResult[]=null;
      int count=0;
      if (input != null && input.length() > 0) {
        input=input.trim();
        StringTokenizer st=new StringTokenizer(input,delimiter);
        count=st.countTokens();
        if (count > 0) {
          strResult=new String[count];
          for (int i=0; i < count; i++) {
            strResult[i]=st.nextToken();
          }
        }
      }
      return strResult;
    }
}
