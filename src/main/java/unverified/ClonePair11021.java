package unverified;

public class ClonePair11021 {

    String method1(String str,String pattern,String replace){
      int s=0;
      int e=0;
      StringBuffer result=new StringBuffer();
      if (pattern == null || pattern.equals(""))   return str;
      while ((e=str.indexOf(pattern,s)) >= 0) {
        result.append(str.substring(s,e));
        result.append(replace);
        s=e + pattern.length();
      }
      result.append(str.substring(s));
      return result.toString();
    }

    String method2(String s,String replace,String with){
      if (replace == null || replace.length() == 0) {
        return s;
      }
      StringBuilder buff=new StringBuilder(s.length());
      int start=0;
      int len=replace.length();
      while (true) {
        int i=s.indexOf(replace,start);
        if (i == -1) {
          break;
        }
        buff.append(s.substring(start,i)).append(with);
        start=i + len;
      }
      buff.append(s.substring(start));
      return buff.toString();
    }
}
