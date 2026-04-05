package all;

public class ClonePair11538 {

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

    String method2(String str,String old_sub,String new_sub){
      if (str.indexOf(old_sub) != -1 && !old_sub.equals(new_sub)) {
        StringBuffer buf=new StringBuffer();
        int len=old_sub.length();
        int index, fromIndex=0;
        while ((index=str.indexOf(old_sub,fromIndex)) != -1) {
          buf.append(str.substring(fromIndex,index));
          buf.append(new_sub);
          fromIndex=index + len;
        }
        buf.append(str.substring(fromIndex));
        return buf.toString();
      }
      return str;
    }
}
