package unverified;

public class ClonePair11242 {

    String method1(String source,String needle,String replace){
      if (null == source || null == needle || replace == null) {
        return source;
      }
      int needleLenth=needle.length();
      StringBuffer sb=new StringBuffer();
      int pos=source.indexOf(needle);
      while (-1 != pos) {
        sb.append(source.substring(0,pos)).append(replace);
        source=source.substring(pos + needleLenth);
        pos=source.indexOf(needle);
      }
      sb.append(source);
      return sb.toString();
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
