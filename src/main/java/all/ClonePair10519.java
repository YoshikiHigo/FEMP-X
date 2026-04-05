package all;

public class ClonePair10519 {

    String method1(String input,String searchStr,String replaceWithStr){
      StringBuffer buffer=new StringBuffer();
      int startIndex=0;
      int oldIndex=0;
      if (input.indexOf(searchStr) == -1) {
        return input;
      }
      while ((startIndex=input.indexOf(searchStr,oldIndex)) != -1) {
        buffer.append(input.substring(oldIndex,startIndex));
        buffer.append(replaceWithStr);
        startIndex+=searchStr.length();
        oldIndex=startIndex;
        if (oldIndex >= input.length()) {
          break;
        }
      }
      if (oldIndex < input.length()) {
        buffer.append(input.substring(oldIndex));
      }
      return buffer.toString();
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
