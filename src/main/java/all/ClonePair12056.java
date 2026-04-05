package all;

public class ClonePair12056 {

    String method1(String source,String mark,String toMark){
      String result=source;
      int p=0;
      while (source != null && mark != null && toMark != null) {
        p=result.indexOf(mark,p);
        if (p == -1) {
          break;
        }
        result=result.substring(0,p) + toMark + result.substring(p + mark.length());
        p+=toMark.length();
      }
      return result;
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
