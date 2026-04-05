package all;

public class ClonePair12889 {

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

    String method2(String text,String originalPattern,String destPattern){
      int start=text.indexOf(originalPattern);
      if (start == -1)   return text;
      int lf=originalPattern.length();
      char[] targetChars=text.toCharArray();
      StringBuffer buffer=new StringBuffer();
      int copyFrom=0;
      while (start != -1) {
        buffer.append(targetChars,copyFrom,start - copyFrom);
        buffer.append(destPattern);
        copyFrom=start + lf;
        start=text.indexOf(originalPattern,copyFrom);
      }
      buffer.append(targetChars,copyFrom,targetChars.length - copyFrom);
      return buffer.toString();
    }
}
