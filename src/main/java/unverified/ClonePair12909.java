package unverified;

public class ClonePair12909 {

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

    String method2(String s,String sub,String with){
      StringBuffer sb=new StringBuffer(s.length() * 2);
      int c=0;
      int i=0;
      while ((i=s.indexOf(sub,c)) != -1) {
        sb.append(s.substring(c,i));
        sb.append(with);
        c=i + sub.length();
      }
      if (c < s.length())   sb.append(s.substring(c,s.length()));
      return sb.toString();
    }
}
