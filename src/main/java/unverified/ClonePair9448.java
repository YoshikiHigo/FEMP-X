package unverified;

public class ClonePair9448 {

    String method1(String orig,String lookFor,String replaceWith){
      int idx=orig.indexOf(lookFor);
      if (idx < 0) {
        return (orig);
      }
      int prev=0;
      StringBuffer rtn=new StringBuffer();
      while (idx >= 0) {
        rtn.append(orig.substring(prev,idx));
        rtn.append(replaceWith);
        prev=idx + lookFor.length();
        idx=orig.indexOf(lookFor,prev);
      }
      rtn.append(orig.substring(prev,orig.length()));
      return (rtn.toString());
    }

    String method2(String text,String repl,String with){
      int c=0;
      int i=text.indexOf(repl,c);
      if (i == -1)   return text;
      StringBuffer buf=new StringBuffer(text.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(text.substring(c,i));
          buf.append(with);
          c=i + repl.length();
        }
     while ((i=text.indexOf(repl,c)) != -1);
        if (c < text.length())     buf.append(text.substring(c,text.length()));
        return buf.toString();
      }
    }
}
