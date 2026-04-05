package unverified;

public class ClonePair11375 {

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

    String method2(String src,String from,String to){
      StringBuffer sb=new StringBuffer(src);
      int i1, i2, tail;
      int len=from.length();
      int fromIndex=0;
      while ((i1=src.indexOf(from,fromIndex)) != -1) {
        i2=i1 + len;
        tail=src.length() - i2;
        sb=sb.replace(i1,i2,to);
        src=new String(sb);
        fromIndex=src.length() - tail;
      }
      return new String(sb);
    }
}
