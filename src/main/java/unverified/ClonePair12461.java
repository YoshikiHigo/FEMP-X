package unverified;

public class ClonePair12461 {

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

    String method2(String src,String from,String to){
      if (src == null)   return null;
      if (from == null)   return src;
      if (to == null)   to="";
      StringBuffer buf=new StringBuffer();
      for (int pos; (pos=src.indexOf(from)) >= 0; ) {
        buf.append(src.substring(0,pos));
        buf.append(to);
        src=src.substring(pos + from.length());
      }
      buf.append(src);
      return buf.toString();
    }
}
