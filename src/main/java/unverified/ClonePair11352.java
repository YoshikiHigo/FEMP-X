package unverified;

public class ClonePair11352 {

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

    String method2(String path,String search,String replacement){
      int index=path.indexOf(search);
      if (index >= 0) {
        String result=path.substring(0,index);
        result+=replacement;
        result+=path.substring(index + search.length());
        return result;
      }
     else {
        return path;
      }
    }
}
