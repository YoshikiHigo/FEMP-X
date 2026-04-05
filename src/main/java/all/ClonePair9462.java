package all;

public class ClonePair9462 {

    String method1(String orig,String lookFor,String replaceWith){
      int idx=orig.indexOf(lookFor);
      if (idx < 0) {
        return (orig);
      }
      int prev=0;
      StringBuffer rtn=new StringBuffer();
      while (idx >= 0) {
        rtn.append(orig.substring(prev,idx));
        rtn.append(replaceWith);
        prev=idx + lookFor.length();
        idx=orig.indexOf(lookFor,prev);
      }
      rtn.append(orig.substring(prev,orig.length()));
      return (rtn.toString());
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
