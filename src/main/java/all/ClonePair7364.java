package all;

public class ClonePair7364 {

    boolean method1(String sub,String s){
      if (sub.length() != s.length())   return false;
      char[] csub=sub.toCharArray();
      char[] c=s.toCharArray();
      for (int i=0; i < csub.length; i++) {
        if (csub[i] != '0' && c[i] == '0')     return false;
      }
      return true;
    }

    boolean method2(String aMatchExpression,String aString){
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
}
