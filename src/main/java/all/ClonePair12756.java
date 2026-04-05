package all;

public class ClonePair12756 {

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

    String method2(String string,String from,String to){
      if (null == string || null == from || null == to) {
        return string;
      }
      if (string.length() == 0 || from.length() == 0) {
        return string;
      }
      StringBuilder sb=new StringBuilder();
      int pos=0;
      int index=string.indexOf(from);
      int patLen=from.length();
      while (index >= 0) {
        sb.append(string.substring(pos,index));
        sb.append(to);
        pos=index + patLen;
        index=string.indexOf(from,pos);
      }
      sb.append(string.substring(pos));
      return sb.toString();
    }
}
