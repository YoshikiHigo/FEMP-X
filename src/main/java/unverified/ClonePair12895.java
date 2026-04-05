package unverified;

public class ClonePair12895 {

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

    String method2(String str,String pattern,String replace){
      int s=0;
      int e=0;
      if (str == null)   str="";
      StringBuffer result=new StringBuffer();
      while ((e=str.indexOf(pattern,s)) >= 0) {
        result.append(str.substring(s,e));
        if (replace != null)     result.append(replace);
        s=e + pattern.length();
      }
      result.append(str.substring(s));
      return result.substring(0);
    }
}
