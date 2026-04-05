package unverified;

public class ClonePair10136 {

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

    String method2(String value,String oldPart,String newPart){
      if (value == null || value.length() == 0 || oldPart == null || oldPart.length() == 0)   return value;
      int oldPartLength=oldPart.length();
      String oldValue=value;
      StringBuffer retValue=new StringBuffer();
      int pos=oldValue.indexOf(oldPart);
      while (pos != -1) {
        retValue.append(oldValue.substring(0,pos));
        if (newPart != null && newPart.length() > 0)     retValue.append(newPart);
        oldValue=oldValue.substring(pos + oldPartLength);
        pos=oldValue.indexOf(oldPart);
      }
      retValue.append(oldValue);
      return retValue.toString();
    }
}
