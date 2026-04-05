package all;

public class ClonePair12463 {

    String method1(String toSearch,String find,String replace){
      if (find == null || toSearch == null || toSearch.indexOf(find) == -1)   return toSearch;
      if (replace == null)   replace="";
      int marker=0, findPos, findLen=find.length();
      StringBuilder sb=new StringBuilder();
      while ((findPos=toSearch.indexOf(find,marker)) > -1) {
        sb.append(toSearch.substring(marker,findPos));
        sb.append(replace);
        marker=findPos + findLen;
      }
      sb.append(toSearch.substring(marker));
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
