package all;

public class ClonePair10137 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
      return sb.toString();
    }

    String method2(String source,String pattern,String replace){
      if (source == null || source.length() == 0 || pattern == null || pattern.length() == 0) {
        return source;
      }
      int k=source.indexOf(pattern);
      if (k == -1) {
        return source;
      }
      StringBuffer out=new StringBuffer();
      int i=0, l=pattern.length();
      while (k != -1) {
        out.append(source.substring(i,k));
        if (replace != null) {
          out.append(replace);
        }
        i=k + l;
        k=source.indexOf(pattern,i);
      }
      out.append(source.substring(i));
      return out.toString();
    }
}
