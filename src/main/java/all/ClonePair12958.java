package all;

public class ClonePair12958 {

    String method1(String text,String toFind,String replaceBy){
      int pos=text.indexOf(toFind);
      if (pos == -1)   return text;
      StringBuffer result=new StringBuffer(text.length());
      while (pos >= 0) {
        result.append(text.substring(0,pos));
        result.append(replaceBy);
        text=text.substring(pos + toFind.length());
        pos=text.indexOf(toFind);
      }
      result.append(text);
      return (result.toString());
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
