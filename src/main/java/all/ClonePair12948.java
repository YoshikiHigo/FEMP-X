package all;

public class ClonePair12948 {

    String method1(String text,String toFind,String replaceBy){
      int pos=text.indexOf(toFind);
      if (pos == -1)   return text;
      StringBuffer result=new StringBuffer(text.length());
      while (pos >= 0) {
        result.append(text.substring(0,pos));
        result.append(replaceBy);
        text=text.substring(pos + toFind.length());
        pos=text.indexOf(toFind);
      }
      result.append(text);
      return (result.toString());
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
