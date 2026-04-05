package unverified;

public class ClonePair12884 {

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

    String method2(String text,String find,String replace){
      int findLength=find.length();
      StringBuffer buffer=new StringBuffer();
      int i;
      for (i=0; i < text.length() - find.length() + 1; i++) {
        String substring=text.substring(i,i + findLength);
        if (substring.equals(find)) {
          buffer.append(replace);
          i+=find.length() - 1;
        }
     else {
          buffer.append(text.charAt(i));
        }
      }
      buffer.append(text.substring(text.length() - (text.length() - i)));
      return buffer.toString();
    }
}
