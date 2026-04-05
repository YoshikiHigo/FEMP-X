package all;

public class ClonePair12441 {

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

    String method2(String orig,String find,String replace){
      if (find == null || find.equals("")) {
        return orig;
      }
      if (replace == null) {
        replace="";
      }
      if (orig == null) {
        return null;
      }
      int origLength=orig.length();
      int findLength=find.length();
      StringBuffer replaced=new StringBuffer((int)(origLength * 2));
      int lastIndex=0;
      int indexOf=orig.indexOf(find,lastIndex);
      while (indexOf > -1) {
        replaced.append(orig.substring(lastIndex,indexOf));
        replaced.append(replace);
        lastIndex=indexOf + findLength;
        indexOf=orig.indexOf(find,lastIndex);
      }
      if (lastIndex < origLength) {
        replaced.append(orig.substring(lastIndex,origLength));
      }
      return replaced.toString();
    }
}
