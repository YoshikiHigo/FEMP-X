package unverified;

public class ClonePair12446 {

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

    String method2(String source,String pattern,String replace){
      if (source == null || source.length() == 0 || pattern == null || pattern.length() == 0) {
        return source;
      }
      int k=source.indexOf(pattern);
      if (k == -1) {
        return source;
      }
      StringBuffer out=new StringBuffer();
      int i=0, l=pattern.length();
      while (k != -1) {
        out.append(source.substring(i,k));
        if (replace != null) {
          out.append(replace);
        }
        i=k + l;
        k=source.indexOf(pattern,i);
      }
      out.append(source.substring(i));
      return out.toString();
    }
}
