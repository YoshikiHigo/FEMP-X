package unverified;

public class ClonePair10733 {

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

    String method2(String value,String searchStr,String replacement){
      StringBuffer strbuf;
      int searchLen;
      int pos;
      if (value == null) {
        return null;
      }
      if (searchStr == null) {
        return value;
      }
      if (replacement == null) {
        replacement="";
      }
      if (value.indexOf(searchStr) == -1) {
        return value;
      }
      strbuf=new StringBuffer();
      searchLen=searchStr.length();
      while ((pos=value.indexOf(searchStr)) != -1) {
        strbuf.append(value.substring(0,pos));
        strbuf.append(replacement);
        value=value.substring(pos + searchLen);
      }
      strbuf.append(value);
      return strbuf.toString();
    }
}
