package all;

public class ClonePair9847 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
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
