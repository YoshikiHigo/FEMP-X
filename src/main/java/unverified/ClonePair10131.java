package unverified;

public class ClonePair10131 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
      return sb.toString();
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
