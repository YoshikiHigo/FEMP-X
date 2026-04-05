package unverified;

public class ClonePair12054 {

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
