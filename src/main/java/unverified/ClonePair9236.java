package unverified;

public class ClonePair9236 {

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

    String method2(String text,String find,String replace){
      int replaceStart=text.indexOf(find);
      if (replaceStart == -1)   return text;
      int findLength=find.length();
      StringBuffer result=new StringBuffer();
      while (replaceStart != -1) {
        result.append(text.substring(0,replaceStart)).append(replace);
        text=text.substring(replaceStart + findLength);
        replaceStart=text.indexOf(find);
      }
      result.append(text);
      return result.toString();
    }
}
