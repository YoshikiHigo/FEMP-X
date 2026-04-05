package unverified;

public class ClonePair12762 {

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

    String method2(String src,String oldStr,String newStr){
      if ((src == null) || (oldStr == null) || (newStr == null))   return src;
      if (oldStr.equals(newStr) || (oldStr.length() == 0))   return src;
      int oldLen=oldStr.length();
      int index=0;
      StringBuffer s=new StringBuffer(src.length());
      int begin=0;
      while ((index=src.indexOf(oldStr,begin)) != -1) {
        s.append(src.substring(begin,index));
        s.append(newStr);
        begin=index + oldLen;
      }
      if (begin < src.length())   s.append(src.substring(begin));
      return s.toString();
    }
}
