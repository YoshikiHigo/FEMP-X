package all;

public class ClonePair8243 {

    boolean method1(String aMatchExpression,String aString){
      int expressionLength=aMatchExpression.length();
      for (int i=0; i < expressionLength; i++) {
        char expChar=aMatchExpression.charAt(i);
        if (expChar == '*')     return true;
        if (i == aString.length())     return false;
        if (expChar == '?')     continue;
        if (expChar != aString.charAt(i))     return false;
      }
      return (expressionLength == aString.length());
    }

    boolean method2(String url1,String url2){
      if ((url1.length() > 1) && url1.endsWith("/"))   url1=url1.substring(0,url1.length() - 1);
      if ((url2.length() > 1) && url2.endsWith("/"))   url2=url2.substring(0,url2.length() - 1);
      if (url1.equalsIgnoreCase(url2))   return true;
      return false;
    }
}
