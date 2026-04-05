package all;

public class ClonePair10925 {

    String method1(String input,int limit,String elipsis){
      if (input == null)   return null;
      if (input.length() > limit) {
        String result=input.substring(0,limit);
        if (elipsis != null)     result+=elipsis;
        return result;
      }
     else   return input;
    }

    String method2(String str,int truncLen,String lastStr){
      if (str == null)   return str;
      int len=str.length();
      if (len <= truncLen)   return str;
      return str.substring(0,truncLen) + ((lastStr == null) ? "" : lastStr);
    }
}
