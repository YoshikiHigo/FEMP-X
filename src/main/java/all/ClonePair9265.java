package all;

public class ClonePair9265 {

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

    String method2(String source,String toBeReplaced,String replacement){
      StringBuffer results=new StringBuffer();
      int len=toBeReplaced.length();
      for (int i=0; i < source.length(); ++i) {
        if (source.regionMatches(false,i,toBeReplaced,0,len)) {
          results.append(replacement);
          i+=len - 1;
        }
     else {
          results.append(source.charAt(i));
        }
      }
      return results.toString();
    }
}
