package all;

public class ClonePair8234 {

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

    boolean method2(String filter,String category){
      int index=-1;
      index=filter.indexOf("*");
      if (index == 0) {
        return true;
      }
     else   if (index < 0) {
        if (category.equals(filter)) {
          return true;
        }
      }
     else {
        if ((category.length() >= index) && category.substring(0,index).equals(filter.substring(0,index))) {
          return true;
        }
      }
      return false;
    }
}
