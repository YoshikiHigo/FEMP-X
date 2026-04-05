package unverified;

public class ClonePair13096 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
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
