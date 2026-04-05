package all;

public class ClonePair11148 {

    String method1(String str,String from,String to){
      if (str == null)   return str;
      int index=str.indexOf(from);
      if (index == -1)   return str;
      int pos=0;
      final int fromLen=from.length();
      final StringBuilder sb=new StringBuilder();
      while (index > -1) {
        sb.append(str.substring(pos,index)).append(to);
        pos=index + fromLen;
        index=str.indexOf(from,pos);
      }
      sb.append(str.substring(pos));
      return sb.toString();
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
