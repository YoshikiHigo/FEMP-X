package all;

public class ClonePair11532 {

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

    String method2(String s,String sub,String with){
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1)   return s;
      StringBuffer buf=new StringBuffer(s.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(s.substring(c,i));
          buf.append(with);
          c=i + sub.length();
        }
     while ((i=s.indexOf(sub,c)) != -1);
        if (c < s.length()) {
          buf.append(s.substring(c,s.length()));
        }
        return buf.toString();
      }
    }
}
