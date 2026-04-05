package unverified;

public class ClonePair10732 {

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

    String method2(String str,String search,String replacement){
      String result=str;
      if (str != null && search != null) {
        final int strLen=str.length();
        final int searchLen=search.length();
        if (strLen > 0 && searchLen > 0) {
          final StringBuffer buf=new StringBuffer(strLen);
          int searchIdx=0;
          int foundIdx=0;
          while (searchIdx < strLen) {
            if ((foundIdx=str.indexOf(search,searchIdx)) != -1) {
              buf.append(str.substring(searchIdx,foundIdx));
              searchIdx=foundIdx + searchLen;
              if (replacement != null && replacement.length() > 0) {
                buf.append(replacement);
              }
            }
     else {
              buf.append(str.substring(searchIdx));
              searchIdx=strLen;
            }
          }
          result=buf.toString();
        }
      }
      return result;
    }
}
