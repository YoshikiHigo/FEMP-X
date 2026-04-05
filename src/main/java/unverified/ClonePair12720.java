package unverified;

public class ClonePair12720 {

    String method1(String in,String match,String replacement){
      if (in == null || match == null || replacement == null) {
        return in;
      }
      StringBuffer out=new StringBuffer();
      int matchLength=match.length();
      int inLength=in.length();
      for (int i=0; i < inLength; i++) {
        int upperSearhLimit=i + matchLength;
        if ((upperSearhLimit <= inLength) && (in.substring(i,upperSearhLimit).equals(match))) {
          out.append(replacement);
          i=upperSearhLimit - 1;
        }
     else {
          out.append(in.charAt(i));
        }
      }
      return out.toString();
    }

    String method2(String text,String repl,String with){
      if (text == null || repl == null || with == null || repl.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int start=0;
      int end=0;
      do {
        end=text.indexOf(repl,start);
        if (end == -1) {
          break;
        }
        buf.append(text.substring(start,end)).append(with);
        start=end + repl.length();
      }
     while (true);
      buf.append(text.substring(start));
      return buf.toString();
    }
}
