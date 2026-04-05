package all;

public class ClonePair10186 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
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
