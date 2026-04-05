package all;

public class ClonePair12883 {

    String method1(String str,String pattern,String replace){
      if (replace == null) {
        replace="";
      }
      int s=0, e=0;
      StringBuffer result=new StringBuffer();
      while ((e=str.indexOf(pattern,s)) >= 0) {
        result.append(str.substring(s,e));
        result.append(replace);
        s=e + pattern.length();
      }
      if (s == 0)   return str;
      result.append(str.substring(s));
      return result.toString();
    }

    String method2(String input,String target,String replacement){
      String upperCaseContent;
      int last=0;
      String returnString="";
      String currentParagraph;
      target=target.toUpperCase();
      int len=target.length();
      while (input.length() > 0) {
        upperCaseContent=input.toUpperCase();
        last=upperCaseContent.indexOf(target);
        currentParagraph="";
        if (last == -1) {
          currentParagraph=input.substring(0,input.length());
          returnString+=currentParagraph;
          input="";
        }
     else {
          currentParagraph=input.substring(0,last);
          returnString+=currentParagraph + replacement;
          input=input.substring(last + len);
        }
      }
      return returnString;
    }
}
