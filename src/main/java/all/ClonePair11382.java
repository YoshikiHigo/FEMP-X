package all;

public class ClonePair11382 {

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

    String method2(String str,String old_sub,String new_sub){
      if (str.indexOf(old_sub) != -1 && !old_sub.equals(new_sub)) {
        StringBuffer buf=new StringBuffer();
        int len=old_sub.length();
        int index, fromIndex=0;
        while ((index=str.indexOf(old_sub,fromIndex)) != -1) {
          buf.append(str.substring(fromIndex,index));
          buf.append(new_sub);
          fromIndex=index + len;
        }
        buf.append(str.substring(fromIndex));
        return buf.toString();
      }
      return str;
    }
}
