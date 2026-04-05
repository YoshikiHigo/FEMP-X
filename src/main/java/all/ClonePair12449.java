package all;

public class ClonePair12449 {

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

    String method2(String source,String match,String newData){
      if (source == null)   return null;
      if (match == null)   return source;
      if (newData == null)   newData="";
      while (source.indexOf(match) >= 0) {
        int begin=source.indexOf(match);
        int end=match.length() + begin;
        if (begin >= 0 && end >= 0) {
          source=source.substring(0,begin) + newData + source.substring(end);
        }
      }
      return source;
    }
}
