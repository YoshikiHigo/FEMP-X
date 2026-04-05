package unverified;

public class ClonePair12206 {

    String method1(String line,String oldString,String newString){
      int i=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char[] line2=line.toCharArray();
        char[] newString2=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j=i;
        while ((i=line.indexOf(oldString,i)) > 0) {
          buf.append(line2,j,i - j).append(newString2);
          i+=oLength;
          j=i;
        }
        buf.append(line2,j,line2.length - j);
        return buf.toString();
      }
      return line;
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
