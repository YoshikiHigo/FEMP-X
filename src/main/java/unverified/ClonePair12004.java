package unverified;

public class ClonePair12004 {

    String method1(String path,String search,String replacement){
      int index=path.indexOf(search);
      if (index >= 0) {
        String result=path.substring(0,index);
        result+=replacement;
        result+=path.substring(index + search.length());
        return result;
      }
     else {
        return path;
      }
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
