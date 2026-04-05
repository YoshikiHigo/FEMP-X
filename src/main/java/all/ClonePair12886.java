package all;

public class ClonePair12886 {

    String method1(String str,String pattern,String replace){
      if (replace == null) {
        replace="";
      }
      int s=0, e=0;
      StringBuffer result=new StringBuffer();
      while ((e=str.indexOf(pattern,s)) >= 0) {
        result.append(str.substring(s,e));
        result.append(replace);
        s=e + pattern.length();
      }
      if (s == 0)   return str;
      result.append(str.substring(s));
      return result.toString();
    }

    String method2(String s,String target,String replacement){
      StringBuilder sb=null;
      int tlen=target.length();
      int bi=0;
      for (int n=s.indexOf(target); n >= 0; n=s.indexOf(target,bi)) {
        if (sb == null) {
          sb=new StringBuilder();
        }
        sb.append(s.substring(bi,n));
        if (replacement != null) {
          sb.append(replacement);
        }
        bi=n + tlen;
      }
      if (sb == null) {
        return s;
      }
     else {
        sb.append(s.substring(bi));
        return sb.toString();
      }
    }
}
