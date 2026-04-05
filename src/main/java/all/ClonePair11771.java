package all;

public class ClonePair11771 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuilder sb=new StringBuilder(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
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
