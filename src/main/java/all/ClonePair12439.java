package all;

public class ClonePair12439 {

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

    String method2(String mainString,String oldString,String newString){
      if (mainString == null) {
        return null;
      }
      if (oldString == null || oldString.length() == 0) {
        return mainString;
      }
      if (newString == null) {
        newString="";
      }
      int i=mainString.lastIndexOf(oldString);
      if (i < 0)   return mainString;
      StringBuffer mainSb=new StringBuffer(mainString);
      while (i >= 0) {
        mainSb.replace(i,i + oldString.length(),newString);
        i=mainString.lastIndexOf(oldString,i - 1);
      }
      return mainSb.toString();
    }
}
