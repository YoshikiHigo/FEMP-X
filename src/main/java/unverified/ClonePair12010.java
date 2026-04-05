package unverified;

public class ClonePair12010 {

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
