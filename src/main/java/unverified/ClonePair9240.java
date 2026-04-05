package unverified;

public class ClonePair9240 {

    String method1(String source,String str1,String str2){
      int index, start=0;
      StringBuffer value=new StringBuffer();
      while ((index=source.indexOf(str1,start)) != -1) {
        value.append(source.substring(start,index) + str2);
        start=index + str1.length();
      }
      if (start < source.length()) {
        value.append(source.substring(start,source.length()));
      }
      return value.toString();
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
