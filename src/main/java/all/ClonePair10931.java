package all;

public class ClonePair10931 {

    String method1(String source,String old,String newstring){
      String sRet="";
      if (source != null && old != null && newstring != null) {
        for (int i=0; i < source.length(); i++) {
          if ((source.length() - i) < (old.length())) {
            while (i < source.length()) {
              sRet+=source.substring(i,i + 1);
              i++;
            }
            break;
          }
          if (source.substring(i,i + old.length()).equals(old)) {
            sRet+=newstring;
            i+=old.length() - 1;
          }
     else {
            sRet+=source.substring(i,i + 1);
          }
        }
      }
      return sRet;
    }

    String method2(String s,String sub,String with){
      if (s != null && sub != null && with != null) {
        int c=0;
        int i=s.indexOf(sub,c);
        if (i == -1)     return s;
        StringBuffer buf=new StringBuffer(s.length() + with.length());
    synchronized (buf) {
          do {
            buf.append(s.substring(c,i));
            buf.append(with);
            c=i + sub.length();
          }
     while ((i=s.indexOf(sub,c)) != -1);
          if (c < s.length())       buf.append(s.substring(c,s.length()));
          return buf.toString();
        }
      }
     else {
        return "";
      }
    }
}
