package all;

public class ClonePair11766 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuilder sb=new StringBuilder(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
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
