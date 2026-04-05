package unverified;

public class ClonePair12113 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuffer sb=new StringBuffer(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
      return sb.toString();
    }

    String method2(String s,String sub,String with){
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1)   return s;
      StringBuffer buf=new StringBuffer(s.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(s.substring(c,i));
          buf.append(with);
          c=i + sub.length();
        }
     while ((i=s.indexOf(sub,c)) != -1);
        if (c < s.length()) {
          buf.append(s.substring(c,s.length()));
        }
        return buf.toString();
      }
    }
}
