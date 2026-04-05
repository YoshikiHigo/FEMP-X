package all;

public class ClonePair12773 {

    String method1(String in,String match,String replacement){
      if (in == null || match == null || replacement == null) {
        return in;
      }
      StringBuffer out=new StringBuffer();
      int matchLength=match.length();
      int inLength=in.length();
      for (int i=0; i < inLength; i++) {
        int upperSearhLimit=i + matchLength;
        if ((upperSearhLimit <= inLength) && (in.substring(i,upperSearhLimit).equals(match))) {
          out.append(replacement);
          i=upperSearhLimit - 1;
        }
     else {
          out.append(in.charAt(i));
        }
      }
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
