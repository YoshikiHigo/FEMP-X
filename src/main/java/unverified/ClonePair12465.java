package unverified;

public class ClonePair12465 {

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

    String method2(String text,String key,String value){
      if (text == null)   return null;
      String buffer=text;
      if (buffer != null && key != null && value != null) {
        int length=key.length();
        for (int start=buffer.indexOf(key); start != -1; start=buffer.indexOf(key,start + value.length())) {
          buffer=buffer.substring(0,start) + value + buffer.substring(start + length);
        }
      }
      return buffer;
    }
}
