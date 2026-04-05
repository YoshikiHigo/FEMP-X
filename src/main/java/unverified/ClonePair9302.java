package unverified;

public class ClonePair9302 {

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
