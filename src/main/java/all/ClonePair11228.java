package all;

public class ClonePair11228 {

    String method1(String source,String needle,String replace){
      if (null == source || null == needle || replace == null) {
        return source;
      }
      int needleLenth=needle.length();
      StringBuffer sb=new StringBuffer();
      int pos=source.indexOf(needle);
      while (-1 != pos) {
        sb.append(source.substring(0,pos)).append(replace);
        source=source.substring(pos + needleLenth);
        pos=source.indexOf(needle);
      }
      sb.append(source);
      return sb.toString();
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
