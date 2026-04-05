package unverified;

public class ClonePair11388 {

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

    String method2(String source,String target,String replacement){
      StringBuffer result=new StringBuffer();
      int index=source.indexOf(target);
      int lastIndex=0;
      if (index >= 0) {
        result.append(source.substring(lastIndex,index));
        result.append(replacement);
        lastIndex=index + target.length();
      }
      if (lastIndex < source.length()) {
        result.append(source.substring(lastIndex));
      }
      return result.toString();
    }
}
