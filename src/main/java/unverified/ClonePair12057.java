package unverified;

public class ClonePair12057 {

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

    String method2(String str,String match,String to){
      if ((str == null) || (match == null) || (to == null)) {
        return str;
      }
      StringBuffer dest=new StringBuffer();
      int len=match.length();
      String org=str;
      int index=org.indexOf(match);
      while (index != -1) {
        dest.append(org.substring(0,index));
        dest.append(to);
        org=org.substring(index + len);
        index=org.indexOf(match);
      }
      dest.append(org);
      return dest.toString();
    }
}
