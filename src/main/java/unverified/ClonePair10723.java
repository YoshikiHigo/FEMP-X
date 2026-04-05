package unverified;

public class ClonePair10723 {

    String method1(String s,String replace,String with){
      if (s == null || replace == null) {
        return s;
      }
      if (with == null) {
        with="";
      }
      StringBuffer b=new StringBuffer();
      int start=0;
      int lenreplace=replace.length();
      while (true) {
        int i=s.indexOf(replace,start);
        if (i == -1) {
          b.append(s.substring(start));
          break;
        }
        b.append(s.substring(start,i - start));
        b.append(with);
        start=i + lenreplace;
      }
      return b.toString();
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
