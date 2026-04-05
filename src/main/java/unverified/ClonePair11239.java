package unverified;

public class ClonePair11239 {

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

    String method2(String src,String from,String to){
      if (src == null)   return null;
      if (from == null)   return src;
      if (to == null)   to="";
      StringBuffer buf=new StringBuffer();
      for (int pos; (pos=src.indexOf(from)) >= 0; ) {
        buf.append(src.substring(0,pos));
        buf.append(to);
        src=src.substring(pos + from.length());
      }
      buf.append(src);
      return buf.toString();
    }
}
