package all;

public class ClonePair12349 {

    String method1(String str,String innerString,String with){
      int c=0;
      int i=str.indexOf(innerString,c);
      if (i == -1) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(str.substring(c,i));
          buf.append(with);
          c=i + innerString.length();
        }
     while ((i=str.indexOf(innerString,c)) != -1);
        if (c < str.length()) {
          buf.append(str.substring(c,str.length()));
        }
        return buf.toString();
      }
    }

    String method2(String s,String find,String replace){
      int found=s.indexOf(find);
      if (found == -1) {
        return s;
      }
      StringBuffer sb=new StringBuffer(s.length());
      int start=0;
      for (; ; ) {
        for (; start < found; start++) {
          sb.append(s.charAt(start));
        }
        if (found == s.length()) {
          break;
        }
        sb.append(replace);
        start+=find.length();
        found=s.indexOf(find,start);
        if (found == -1) {
          found=s.length();
        }
      }
      return sb.toString();
    }
}
