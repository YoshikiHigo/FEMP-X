package unverified;

public class ClonePair11517 {

    String method1(String inputString,String oldString,String newString){
      StringBuffer outputString=new StringBuffer(100);
      int startIndex=0, nextIndex;
      while (inputString.substring(startIndex).indexOf(oldString) > -1) {
        nextIndex=startIndex + inputString.substring(startIndex).indexOf(oldString);
        if (nextIndex > startIndex) {
          outputString.append(inputString.substring(startIndex,nextIndex));
        }
        outputString.append(newString);
        startIndex=nextIndex + oldString.length();
      }
      if (startIndex <= inputString.length() - 1) {
        outputString.append(inputString.substring(startIndex));
      }
      return outputString.toString();
    }

    String method2(String subject,String original,String replacement){
      StringBuffer output=new StringBuffer();
      int p=0;
      int i;
      while ((i=subject.indexOf(original,p)) != -1) {
        output.append(subject.substring(p,i));
        output.append(replacement);
        p=i + original.length();
      }
      if (p < subject.length())   output.append(subject.substring(p));
      return output.toString();
    }
}
