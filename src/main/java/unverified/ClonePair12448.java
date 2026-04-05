package unverified;

public class ClonePair12448 {

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

    String method2(String source,String target,String replacement){
      if (source == null)   return null;
      if (source.equals(""))   return source;
      if (target == null)   return source;
      if (target.equals(""))   return source;
      if (replacement == null)   replacement="";
      int targetLength=target.length();
      int replacementLength=replacement.length();
      StringBuffer sb=new StringBuffer(source);
      int pos=sb.toString().indexOf(target);
      while (pos > -1) {
        sb.replace(pos,(pos + targetLength),replacement);
        pos=sb.toString().indexOf(target,pos + replacementLength);
      }
      return sb.toString();
    }
}
