package unverified;

public class ClonePair12476 {

    String method1(String string,String oldPattern,String newPattern){
      if (string == null)   return string;
      int oldIndex=string.indexOf(oldPattern);
      if (oldIndex < 0)   return string;
      StringBuffer returnVal=new StringBuffer();
      int start=0;
      do {
        returnVal.append(string.substring(start,oldIndex));
        returnVal.append(newPattern);
        start=oldIndex + oldPattern.length();
        oldIndex=string.indexOf(oldPattern,start);
      }
     while (oldIndex > 0);
      returnVal.append(string.substring(start));
      return returnVal.toString();
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
