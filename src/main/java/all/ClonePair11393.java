package all;

public class ClonePair11393 {

    String method1(String text,String repl,String with,int max){
      if ((text == null) || (repl == null) || (with == null)|| (repl.length() == 0)|| (max == 0)) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int start=0;
      int end=0;
      while ((end=text.indexOf(repl,start)) != -1) {
        buf.append(text.substring(start,end)).append(with);
        start=end + repl.length();
        if (--max == 0) {
          break;
        }
      }
      buf.append(text.substring(start));
      return buf.toString();
    }

    String method2(String source,String target,String replacement,int ordinal2Seek){
      if (source == null)   return null;
      if (source.equals(""))   return source;
      if (target == null)   return source;
      if (target.equals(""))   return source;
      if (replacement == null)   replacement="";
      int targetLength=target.length();
      int replacementLength=replacement.length();
      StringBuffer sb=new StringBuffer(source);
      int ordinalFound=0;
      int pos=sb.toString().indexOf(target);
      while (pos > -1) {
        ordinalFound++;
        if (ordinalFound == ordinal2Seek) {
          sb.replace(pos,(pos + targetLength),replacement);
          break;
        }
     else {
          pos=sb.toString().indexOf(target,pos + replacementLength);
        }
      }
      return sb.toString();
    }
}
