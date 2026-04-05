package unverified;

public class ClonePair13129 {

    String method1(String input,String sub,String with){
      int fromIndex=0;
      int index=input.indexOf(sub,fromIndex);
      if (index == -1) {
        return input;
      }
      final StringBuilder buf=new StringBuilder(input.length() + with.length());
      do {
        buf.append(input.substring(fromIndex,index));
        buf.append(with);
        fromIndex=index + sub.length();
      }
     while ((index=input.indexOf(sub,fromIndex)) != -1);
      if (fromIndex < input.length()) {
        buf.append(input.substring(fromIndex,input.length()));
      }
      return buf.toString();
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
