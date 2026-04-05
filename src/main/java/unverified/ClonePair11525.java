package unverified;

public class ClonePair11525 {

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

    String method2(String s,String before,String after){
      StringBuilder buff=new StringBuilder(s.length());
      int index=0;
      while (true) {
        int next=s.indexOf(before,index);
        if (next < 0) {
          buff.append(s.substring(index));
          break;
        }
        buff.append(s.substring(index,next)).append(after);
        index=next + before.length();
      }
      return buff.toString();
    }
}
