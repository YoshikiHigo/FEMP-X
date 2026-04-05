package all;

public class ClonePair10719 {

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

    String method2(String source,String pattern,String replace){
      if (source == null || source.length() == 0 || pattern == null || pattern.length() == 0) {
        return source;
      }
      int k=source.indexOf(pattern);
      if (k == -1) {
        return source;
      }
      StringBuffer out=new StringBuffer();
      int i=0, l=pattern.length();
      while (k != -1) {
        out.append(source.substring(i,k));
        if (replace != null) {
          out.append(replace);
        }
        i=k + l;
        k=source.indexOf(pattern,i);
      }
      out.append(source.substring(i));
      return out.toString();
    }
}
