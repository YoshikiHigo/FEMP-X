package unverified;

public class ClonePair12725 {

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

    String method2(String line,String from,String to){
      if (line == null)   return null;
      if (from == null || from.equals(""))   return "";
      StringBuffer buf=new StringBuffer();
      int line_pos=0;
      do {
        int pos=line.indexOf(from,line_pos);
        if (pos == -1)     pos=line.length();
        String chunk=line.substring(line_pos,pos);
        buf.append(chunk);
        if (pos != line.length())     buf.append(to);
        line_pos+=chunk.length() + from.length();
      }
     while (line_pos < line.length());
      return buf.toString();
    }
}
