package all;

public class ClonePair12953 {

    String method1(String text,String toFind,String replaceBy){
      int pos=text.indexOf(toFind);
      if (pos == -1)   return text;
      StringBuffer result=new StringBuffer(text.length());
      while (pos >= 0) {
        result.append(text.substring(0,pos));
        result.append(replaceBy);
        text=text.substring(pos + toFind.length());
        pos=text.indexOf(toFind);
      }
      result.append(text);
      return (result.toString());
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
