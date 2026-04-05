package all;

public class ClonePair11621 {

    String method1(String s,String oldPart,String newPart){
      if ((s == null) || (oldPart == null) || (newPart == null)) {
        return s;
      }
      int i=s.indexOf(oldPart);
      if (i < 0) {
        return s;
      }
      return s.substring(0,i) + newPart + s.substring(i + oldPart.length());
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
