package all;

public class ClonePair11374 {

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

    String method2(String orig,String find,String repl){
      StringBuffer buf=new StringBuffer();
      int pos=0;
      while (pos < orig.length()) {
        int foundPos=orig.indexOf(find,pos);
        if (foundPos == -1) {
          break;
        }
     else {
          buf.append(orig.substring(pos,foundPos));
          buf.append(repl);
          pos=foundPos + find.length();
        }
      }
      buf.append(orig.substring(pos));
      return buf.toString();
    }
}
