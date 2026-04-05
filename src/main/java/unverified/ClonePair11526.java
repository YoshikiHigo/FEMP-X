package unverified;

public class ClonePair11526 {

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

    String method2(String text,String originalPattern,String destPattern){
      int start=text.indexOf(originalPattern);
      if (start == -1)   return text;
      int lf=originalPattern.length();
      char[] targetChars=text.toCharArray();
      StringBuffer buffer=new StringBuffer();
      int copyFrom=0;
      while (start != -1) {
        buffer.append(targetChars,copyFrom,start - copyFrom);
        buffer.append(destPattern);
        copyFrom=start + lf;
        start=text.indexOf(originalPattern,copyFrom);
      }
      buffer.append(targetChars,copyFrom,targetChars.length - copyFrom);
      return buffer.toString();
    }
}
