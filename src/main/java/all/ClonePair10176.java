package all;

public class ClonePair10176 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
      return sb.toString();
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
