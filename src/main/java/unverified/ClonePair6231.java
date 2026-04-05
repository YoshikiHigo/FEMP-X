package unverified;

public class ClonePair6231 {

    boolean method1(String a,String b){
      if (a == b) {
        return true;
      }
      int n=a.length();
      if (n == b.length()) {
        while (--n >= 0) {
          if (a.charAt(n) != b.charAt(n))       return false;
        }
        return true;
      }
      return false;
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
