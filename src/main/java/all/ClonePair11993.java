package all;

public class ClonePair11993 {

    String method1(String path,String search,String replacement){
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

    String method2(String value,String src,String dest){
      StringBuffer result=new StringBuffer();
      int pos=0;
      int index=value.indexOf(src);
      while (index >= 0) {
        if (index > pos)     result.append(value.substring(pos,index - 1));
        result.append(dest);
        pos=pos + src.length();
        index=value.indexOf(src,index + dest.length());
      }
      result.append(value.substring(pos));
      return result.toString();
    }
}
