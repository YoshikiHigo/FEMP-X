package unverified;

public class ClonePair12466 {

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

    String method2(String sTarget,String sSubstring,String sReplaceWith){
      if ((sTarget != null) && (sSubstring != null)) {
        if (sReplaceWith == null) {
          sReplaceWith="";
        }
        int len=sTarget.length();
        int searchlen=sSubstring.length();
        int replacelen=sReplaceWith.length();
        StringBuffer result=null;
        int pos=0;
        int lastPos=0;
        while ((pos=sTarget.indexOf(sSubstring,lastPos)) > -1) {
          if (result == null) {
            result=new StringBuffer(len);
          }
          result.append(sTarget.substring(lastPos,pos));
          if (replacelen > 0) {
            result.append(sReplaceWith);
          }
          lastPos=pos + searchlen;
        }
        if (result != null) {
          if (lastPos < len) {
            result.append(sTarget.substring(lastPos));
          }
          return result.toString();
        }
      }
      return sTarget;
    }
}
