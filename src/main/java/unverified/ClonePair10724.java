package unverified;

public class ClonePair10724 {

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

    String method2(String source,String match,String newData){
      if (source == null)   return null;
      if (match == null)   return source;
      if (newData == null)   newData="";
      while (source.indexOf(match) >= 0) {
        int begin=source.indexOf(match);
        int end=match.length() + begin;
        if (begin >= 0 && end >= 0) {
          source=source.substring(0,begin) + newData + source.substring(end);
        }
      }
      return source;
    }
}
