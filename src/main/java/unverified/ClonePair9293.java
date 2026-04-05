package unverified;

public class ClonePair9293 {

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

    String method2(String input,String replace,String replacement){
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      StringBuffer returning=new StringBuffer();
      while (idx != -1) {
        returning.append(input.substring(0,idx));
        returning.append(replacement);
        input=input.substring(idx + replace.length());
        idx=input.indexOf(replace);
      }
      returning.append(input);
      return returning.toString();
    }
}
