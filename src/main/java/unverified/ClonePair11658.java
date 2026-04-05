package unverified;

public class ClonePair11658 {

    String method1(String in,String what,String with){
      int pos=0, lp=0;
      StringBuffer sb=new StringBuffer();
      while ((pos=in.indexOf(what,lp)) > -1) {
        sb.append(in.substring(lp,pos));
        sb.append(with);
        lp=pos + what.length();
      }
      if (lp < in.length()) {
        sb.append(in.substring(lp));
      }
      return sb.toString();
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
