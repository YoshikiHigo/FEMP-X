package all;

public class ClonePair9258 {

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

    String method2(String input,String search,String replacement){
      int pos=input.indexOf(search);
      if (pos != -1) {
        int lastPos=pos;
        while (true) {
          pos=input.indexOf(search,lastPos + 1);
          if (pos == -1) {
            break;
          }
     else {
            lastPos=pos;
          }
        }
        input=input.substring(0,lastPos) + replacement + input.substring(lastPos + search.length());
      }
      return input;
    }
}
