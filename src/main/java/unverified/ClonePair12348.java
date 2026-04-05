package unverified;

public class ClonePair12348 {

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

    String method2(String orig,String token,String replacement){
      if (orig.indexOf(token) < 0)   return orig;
      int tokenlen=token.length();
      int posn;
      String result="";
      while ((posn=orig.indexOf(token)) >= 0) {
        result+=orig.substring(0,posn) + replacement;
        orig=orig.substring(posn + tokenlen);
      }
      return result + orig;
    }
}
