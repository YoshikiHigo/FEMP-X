package unverified;

public class ClonePair12039 {

    String method1(String source,String mark,String toMark){
      String result=source;
      int p=0;
      while (source != null && mark != null && toMark != null) {
        p=result.indexOf(mark,p);
        if (p == -1) {
          break;
        }
        result=result.substring(0,p) + toMark + result.substring(p + mark.length());
        p+=toMark.length();
      }
      return result;
    }

    String method2(String inputString,String subString,String replaceString){
      StringBuffer result=null;
      int fi=0;
      int si=0;
      String retval=null;
      if (inputString != null) {
        inputString=inputString.trim();
        result=new StringBuffer(inputString.length());
        if (subString != null && replaceString != null) {
          subString=subString.trim();
          replaceString=replaceString.trim();
          while ((si=inputString.indexOf(subString,fi)) >= 0) {
            result.append(inputString.substring(fi,si));
            result.append(replaceString);
            fi=si + subString.length();
          }
          if (fi < inputString.length()) {
            result.append(inputString.substring(fi));
          }
        }
     else {
          result.append(inputString);
        }
        retval=result.toString();
      }
      return retval;
    }
}
