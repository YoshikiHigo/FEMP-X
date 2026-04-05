package unverified;

public class ClonePair11222 {

    String method1(String source,String needle,String replace){
      if (null == source || null == needle || replace == null) {
        return source;
      }
      int needleLenth=needle.length();
      StringBuffer sb=new StringBuffer();
      int pos=source.indexOf(needle);
      while (-1 != pos) {
        sb.append(source.substring(0,pos)).append(replace);
        source=source.substring(pos + needleLenth);
        pos=source.indexOf(needle);
      }
      sb.append(source);
      return sb.toString();
    }

    String method2(String text,String repl,String with){
      if (text == null || repl == null || with == null || repl.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int start=0;
      int end=0;
      do {
        end=text.indexOf(repl,start);
        if (end == -1) {
          break;
        }
        buf.append(text.substring(start,end)).append(with);
        start=end + repl.length();
      }
     while (true);
      buf.append(text.substring(start));
      return buf.toString();
    }
}
