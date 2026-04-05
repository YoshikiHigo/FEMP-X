package unverified;

public class ClonePair13081 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
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
