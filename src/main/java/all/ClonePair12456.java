package all;

public class ClonePair12456 {

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

    String method2(String s,String f,String r){
      if (s == null)   return s;
      if (f == null)   return s;
      if (r == null)   r="";
      int index01=s.indexOf(f);
      while (index01 != -1) {
        s=s.substring(0,index01) + r + s.substring(index01 + f.length());
        index01+=r.length();
        index01=s.indexOf(f,index01);
      }
      return s;
    }
}
