package unverified;

public class ClonePair11518 {

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

    String method2(String textToChange,String fromText,String toText){
      if (textToChange.contains(fromText)) {
        StringBuilder sb=new StringBuilder(textToChange.length() - fromText.length() + toText.length());
        int start=textToChange.toLowerCase().indexOf(fromText.toLowerCase());
        while (start != -1) {
          sb.setLength(0);
          int end=start + fromText.length();
          sb.append(textToChange.substring(0,start));
          sb.append(toText);
          sb.append(textToChange.substring(end));
          textToChange=sb.toString();
          start=textToChange.indexOf(fromText);
        }
      }
      return textToChange;
    }
}
