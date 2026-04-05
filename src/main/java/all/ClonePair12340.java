package all;

public class ClonePair12340 {

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

    String method2(String orig,String find,String repl){
      StringBuffer buf=new StringBuffer();
      int pos=0;
      while (pos < orig.length()) {
        int foundPos=orig.indexOf(find,pos);
        if (foundPos == -1) {
          break;
        }
     else {
          buf.append(orig.substring(pos,foundPos));
          buf.append(repl);
          pos=foundPos + find.length();
        }
      }
      buf.append(orig.substring(pos));
      return buf.toString();
    }
}
