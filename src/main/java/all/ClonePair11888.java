package all;

public class ClonePair11888 {

    String method1(String source,String findToken,String replaceToken){
      if (source == null) {
        return null;
      }
      StringBuilder sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(findToken)) < 0) {
          break;
        }
        if (sb == null) {
          sb=new StringBuilder();
        }
        if (pos > 0) {
          sb.append(source.substring(0,pos));
        }
        sb.append(replaceToken);
        source=source.substring(pos + findToken.length());
      }
     while (source.length() > 0);
      if (sb == null) {
        return source;
      }
     else {
        sb.append(source);
        return sb.toString();
      }
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
