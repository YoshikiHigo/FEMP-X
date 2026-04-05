package unverified;

public class ClonePair11726 {

    String method1(String initialString,String toReplace,String replacement){
      if (initialString == null) {
        return null;
      }
      if (toReplace != null && !(toReplace.equals("")) && replacement != null) {
        StringBuffer stb=new StringBuffer();
        int index=initialString.indexOf(toReplace);
        int oldIndex=0;
        while (index != -1) {
          stb.append(initialString.substring(oldIndex,index));
          stb.append(replacement);
          oldIndex=index + toReplace.length();
          index=initialString.indexOf(toReplace,index + toReplace.length());
        }
        stb.append(initialString.substring(oldIndex));
        return stb.toString();
      }
     else {
        return initialString;
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
