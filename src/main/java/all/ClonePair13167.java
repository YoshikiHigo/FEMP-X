package all;

public class ClonePair13167 {

    String method1(String input,String sub,String with){
      int fromIndex=0;
      int index=input.indexOf(sub,fromIndex);
      if (index == -1) {
        return input;
      }
      final StringBuilder buf=new StringBuilder(input.length() + with.length());
      do {
        buf.append(input.substring(fromIndex,index));
        buf.append(with);
        fromIndex=index + sub.length();
      }
     while ((index=input.indexOf(sub,fromIndex)) != -1);
      if (fromIndex < input.length()) {
        buf.append(input.substring(fromIndex,input.length()));
      }
      return buf.toString();
    }

    String method2(String string,String match,String replace){
      int matchLen=match.length();
      int replaceLen=replace.length();
      int delta=replaceLen - matchLen;
      if (delta < 0) {
        delta=0;
      }
     else {
        delta=delta + delta;
      }
      StringBuilder result=new StringBuilder(string.length() + delta);
      int oldPos=0;
      int pos=string.indexOf(match);
      while (pos >= 0) {
        if (pos > oldPos) {
          result.append(string.substring(oldPos,pos));
        }
        result.append(replace);
        oldPos=pos + matchLen;
        pos=string.indexOf(match,oldPos);
      }
      if (oldPos < string.length()) {
        result.append(string.substring(oldPos));
      }
      return result.toString();
    }
}
