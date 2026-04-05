package all;

public class ClonePair11509 {

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

    String method2(String src,String replace,String with){
      String result;
      int pos;
      result="";
      while (!src.equals("")) {
        pos=src.indexOf(replace);
        if (pos == -1) {
          result+=src;
          src="";
        }
     else {
          result+=src.substring(0,pos) + with;
          src=src.substring(pos + replace.length(),src.length());
        }
      }
      return result;
    }
}
