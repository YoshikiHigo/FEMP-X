package all;

public class ClonePair11911 {

    String method1(String source,String findToken,String replaceToken){
      if (source == null) {
        return null;
      }
      StringBuilder sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(findToken)) < 0) {
          break;
        }
        if (sb == null) {
          sb=new StringBuilder();
        }
        if (pos > 0) {
          sb.append(source.substring(0,pos));
        }
        sb.append(replaceToken);
        source=source.substring(pos + findToken.length());
      }
     while (source.length() > 0);
      if (sb == null) {
        return source;
      }
     else {
        sb.append(source);
        return sb.toString();
      }
    }

    String method2(String line,String oldString,String newString){
      if (line == null) {
        return null;
      }
      final int i=line.indexOf(oldString);
      if (i < 0) {
        return line;
      }
      final StringBuffer buf=new StringBuffer(line.substring(0,i));
      buf.append(newString);
      buf.append(line.substring(i + oldString.length()));
      return buf.toString();
    }
}
