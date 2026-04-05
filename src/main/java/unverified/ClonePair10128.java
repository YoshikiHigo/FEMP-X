package unverified;

public class ClonePair10128 {

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
