package unverified;

public class ClonePair11377 {

    String method1(String source,String from,String to){
      StringBuffer result=new StringBuffer(source);
      int idx=source.indexOf(from);
      int lastPos=0;
      if (idx > -1)   result=new StringBuffer();
      while (idx > -1) {
        result.append(source.substring(lastPos,idx));
        result.append(to);
        lastPos=idx + from.length();
        idx=source.indexOf(from,lastPos);
        if (idx < 0)     result.append(source.substring(lastPos,source.length()));
      }
      return result.toString();
    }

    String method2(String text,String orig,String repl){
      int pos=0;
      while ((pos=text.indexOf(orig,pos)) >= 0) {
        text=text.substring(0,pos) + repl + text.substring(pos + orig.length(),text.length());
      }
      return text;
    }
}
