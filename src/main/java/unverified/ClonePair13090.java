package unverified;

public class ClonePair13090 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
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
