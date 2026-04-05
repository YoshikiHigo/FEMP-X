package unverified;

public class ClonePair11978 {

    String method1(String inString,String oldPattern,String newPattern){
      if (inString == null) {
        return null;
      }
      if (oldPattern == null || newPattern == null) {
        return inString;
      }
      StringBuffer sbuf=new StringBuffer();
      int pos=0;
      int index=inString.indexOf(oldPattern);
      int patLen=oldPattern.length();
      while (index >= 0) {
        sbuf.append(inString.substring(pos,index));
        sbuf.append(newPattern);
        pos=index + patLen;
        index=inString.indexOf(oldPattern,pos);
      }
      sbuf.append(inString.substring(pos));
      return sbuf.toString();
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
