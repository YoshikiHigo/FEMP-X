package all;

public class ClonePair10731 {

    String method1(String s,String replace,String with){
      if (s == null || replace == null) {
        return s;
      }
      if (with == null) {
        with="";
      }
      StringBuffer b=new StringBuffer();
      int start=0;
      int lenreplace=replace.length();
      while (true) {
        int i=s.indexOf(replace,start);
        if (i == -1) {
          b.append(s.substring(start));
          break;
        }
        b.append(s.substring(start,i - start));
        b.append(with);
        start=i + lenreplace;
      }
      return b.toString();
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
