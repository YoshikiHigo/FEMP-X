package unverified;

public class ClonePair12447 {

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

    String method2(String value,String oldPart,String newPart){
      if ((value == null) || (value.length() == 0) || (oldPart == null)|| (oldPart.length() == 0)) {
        return value;
      }
      int oldPartLength=oldPart.length();
      String oldValue=value;
      StringBuffer retValue=new StringBuffer();
      int pos=oldValue.indexOf(oldPart);
      while (pos != -1) {
        retValue.append(oldValue.substring(0,pos));
        if ((newPart != null) && (newPart.length() > 0)) {
          retValue.append(newPart);
        }
        oldValue=oldValue.substring(pos + oldPartLength);
        pos=oldValue.indexOf(oldPart);
      }
      retValue.append(oldValue);
      return retValue.toString();
    }
}
