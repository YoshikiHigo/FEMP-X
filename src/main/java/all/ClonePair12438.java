package all;

public class ClonePair12438 {

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

    String method2(String data,String oldS,String newS){
      if (data == null)   return null;
      if (oldS == null || newS == null)   return data;
      StringBuffer buf=new StringBuffer(data.length());
      int pos=-1;
      int i=0;
      while ((pos=data.indexOf(oldS,i)) != -1) {
        buf.append(data.substring(i,pos)).append(newS);
        i=pos + oldS.length();
      }
      buf.append(data.substring(i));
      return buf.toString();
    }
}
