package all;

public class ClonePair13455 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
    }

    String method2(String expression,String oldString,String newString){
      String replacedExpression=expression;
      if (replacedExpression != null) {
        int charCtr=0;
        int oldStringIndex=replacedExpression.indexOf(oldString,charCtr);
        while (oldStringIndex > -1) {
          final StringBuffer buffer=new StringBuffer(replacedExpression.substring(0,oldStringIndex) + replacedExpression.substring(oldStringIndex + oldString.length()));
          buffer.insert(oldStringIndex,newString);
          replacedExpression=buffer.toString();
          charCtr=oldStringIndex + newString.length();
          if (charCtr < replacedExpression.length()) {
            oldStringIndex=replacedExpression.indexOf(oldString,charCtr);
          }
     else {
            oldStringIndex=-1;
          }
        }
      }
      return replacedExpression;
    }
}
