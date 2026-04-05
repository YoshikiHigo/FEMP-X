package all;

public class ClonePair9902 {

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

    String method2(String value,String searchStr,String replacement){
      StringBuffer strbuf;
      int searchLen;
      int pos;
      if (value == null) {
        return null;
      }
      if (searchStr == null) {
        return value;
      }
      if (replacement == null) {
        replacement="";
      }
      if (value.indexOf(searchStr) == -1) {
        return value;
      }
      strbuf=new StringBuffer();
      searchLen=searchStr.length();
      while ((pos=value.indexOf(searchStr)) != -1) {
        strbuf.append(value.substring(0,pos));
        strbuf.append(replacement);
        value=value.substring(pos + searchLen);
      }
      strbuf.append(value);
      return strbuf.toString();
    }
}
