package unverified;

public class ClonePair12450 {

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

    String method2(String s,String replaceFrom,String repalceTo){
      if (s == null || replaceFrom == null)   return s;
      if (repalceTo == null)   repalceTo="";
      StringBuffer result=new StringBuffer();
      int index=0;
      int j=0;
      while ((j=s.indexOf(replaceFrom,index)) != -1) {
        result.append(s.substring(index,j));
        result.append(repalceTo);
        index=j + replaceFrom.length();
      }
      if (index == 0) {
        return s;
      }
     else {
        result.append(s.substring(index));
        return result.toString();
      }
    }
}
