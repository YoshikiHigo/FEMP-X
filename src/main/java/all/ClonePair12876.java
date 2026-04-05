package all;

public class ClonePair12876 {

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

    String method2(String str,String repl,String with){
      int lastindex=0;
      int pos=str.indexOf(repl);
      if (pos < 0) {
        return str;
      }
      int len=repl.length();
      int lendiff=with.length() - repl.length();
      StringBuilder out=new StringBuilder((lendiff <= 0) ? str.length() : (str.length() + (lendiff << 3)));
      for (; pos >= 0; pos=str.indexOf(repl,lastindex=pos + len)) {
        out.append(str.substring(lastindex,pos)).append(with);
      }
      return out.append(str.substring(lastindex,str.length())).toString();
    }
}
