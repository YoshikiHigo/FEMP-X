package all;

public class ClonePair11893 {

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

    String method2(String container,String tag,String replacement){
      final String BLANK="";
      StringBuffer buffer=new StringBuffer("");
      int start=0;
      int end=0;
      if (container == null || container.trim().length() == 0) {
        return container;
      }
      if (replacement == null) {
        replacement=BLANK;
      }
      end=container.indexOf(tag);
      while (end != -1) {
        buffer.append(container.substring(start,end));
        buffer.append(replacement);
        start=end + tag.length();
        end=container.indexOf(tag,start);
      }
      buffer.append(container.substring(start));
      return buffer.toString();
    }
}
