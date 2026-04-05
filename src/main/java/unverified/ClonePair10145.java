package unverified;

public class ClonePair10145 {

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

    String method2(String s,String replaceFrom,String repalceTo){
      if (s == null || replaceFrom == null)   return s;
      if (repalceTo == null)   repalceTo="";
      StringBuffer result=new StringBuffer();
      int index=0;
      int j=0;
      while ((j=s.indexOf(replaceFrom,index)) != -1) {
        result.append(s.substring(index,j));
        result.append(repalceTo);
        index=j + replaceFrom.length();
      }
      if (index == 0) {
        return s;
      }
     else {
        result.append(s.substring(index));
        return result.toString();
      }
    }
}
