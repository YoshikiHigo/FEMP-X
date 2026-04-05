package all;

public class ClonePair12406 {

    String method1(String string,String toBeReplaced,String replacement){
      if (string == null || toBeReplaced == null || replacement == null)   return string;
      String tail=string;
      StringBuffer result=new StringBuffer(string.length() + replacement.length());
      int length=toBeReplaced.length();
      int begin;
      while (!tail.equals("")) {
        begin=tail.indexOf(toBeReplaced);
        if (begin == -1) {
          result.append(tail);
          return result.toString();
        }
        result.append(tail.substring(0,begin)).append(replacement);
        tail=tail.substring(begin + length);
      }
      return result.toString();
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
