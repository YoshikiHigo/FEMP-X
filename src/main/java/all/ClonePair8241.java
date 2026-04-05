package all;

public class ClonePair8241 {

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

    boolean method2(String a,String b){
      if (a == b) {
        return true;
      }
      if (a.length() != b.length())   return false;
      int n=a.length();
      if (n == b.length()) {
        for (int i=n - 1; i >= 0; i--) {
          if (a.charAt(i) != b.charAt(i)) {
            return false;
          }
        }
      }
      return true;
    }
}
