package unverified;

public class ClonePair12260 {

    String method1(String strOrig,String strFind,String strReplace){
      if (strOrig == null) {
        return null;
      }
      StringBuffer sb=new StringBuffer(strOrig);
      String toReplace="";
      if (strReplace == null)   toReplace="";
     else   toReplace=strReplace;
      int pos=strOrig.length();
      while (pos > -1) {
        pos=strOrig.lastIndexOf(strFind,pos);
        if (pos > -1)     sb.replace(pos,pos + strFind.length(),toReplace);
        pos=pos - strFind.length();
      }
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
