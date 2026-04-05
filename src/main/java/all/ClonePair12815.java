package all;

public class ClonePair12815 {

    String method1(String text,String src,String tar){
      StringBuffer sb=new StringBuffer();
      if (text == null || src == null || tar == null) {
        return text;
      }
     else {
        int size=text.length();
        int gap=src.length();
        for (int start=0; start >= 0 && start < size; ) {
          int i=text.indexOf(src,start);
          if (i == -1) {
            sb.append(text.substring(start));
            start=-1;
          }
     else {
            sb.append(text.substring(start,i)).append(tar);
            start=i + gap;
          }
        }
        return sb.toString();
      }
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
