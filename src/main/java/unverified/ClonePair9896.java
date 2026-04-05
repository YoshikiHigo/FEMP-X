package unverified;

public class ClonePair9896 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
    }

    String method2(String str,String search,String replacement){
      String result=str;
      if (str != null && search != null) {
        final int strLen=str.length();
        final int searchLen=search.length();
        if (strLen > 0 && searchLen > 0) {
          final StringBuffer buf=new StringBuffer(strLen);
          int searchIdx=0;
          int foundIdx=0;
          while (searchIdx < strLen) {
            if ((foundIdx=str.indexOf(search,searchIdx)) != -1) {
              buf.append(str.substring(searchIdx,foundIdx));
              searchIdx=foundIdx + searchLen;
              if (replacement != null && replacement.length() > 0) {
                buf.append(replacement);
              }
            }
     else {
              buf.append(str.substring(searchIdx));
              searchIdx=strLen;
            }
          }
          result=buf.toString();
        }
      }
      return result;
    }
}
