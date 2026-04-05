package all;

public class ClonePair11965 {

    String method1(String inString,String oldPattern,String newPattern){
      if (inString == null) {
        return null;
      }
      if (oldPattern == null || newPattern == null) {
        return inString;
      }
      StringBuffer sbuf=new StringBuffer();
      int pos=0;
      int index=inString.indexOf(oldPattern);
      int patLen=oldPattern.length();
      while (index >= 0) {
        sbuf.append(inString.substring(pos,index));
        sbuf.append(newPattern);
        pos=index + patLen;
        index=inString.indexOf(oldPattern,pos);
      }
      sbuf.append(inString.substring(pos));
      return sbuf.toString();
    }

    String method2(String source,String target,String replacement){
      if (source == null)   return null;
      if (source.equals(""))   return source;
      if (target == null)   return source;
      if (target.equals(""))   return source;
      if (replacement == null)   replacement="";
      int targetLength=target.length();
      int replacementLength=replacement.length();
      StringBuffer sb=new StringBuffer(source);
      int pos=sb.toString().indexOf(target);
      while (pos > -1) {
        sb.replace(pos,(pos + targetLength),replacement);
        pos=sb.toString().indexOf(target,pos + replacementLength);
      }
      return sb.toString();
    }
}
