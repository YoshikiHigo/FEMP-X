package all;

public class ClonePair12045 {

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

    String method2(String str,String from,String to){
      int lenFrom;
      if (str == null) {
        return null;
      }
     else   if (from == null || (lenFrom=from.length()) == 0 || to == null) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      int lenTo=to.length();
      int pos=buf.indexOf(from);
      while (pos >= 0) {
        buf.replace(pos,pos + lenFrom,to);
        pos=buf.indexOf(from,pos + lenTo);
      }
      return buf.toString();
    }
}
