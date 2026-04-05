package unverified;

public class ClonePair10171 {

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

    String method2(String string,String from,String to){
      if (null == string || null == from || null == to) {
        return string;
      }
      if (string.length() == 0 || from.length() == 0) {
        return string;
      }
      StringBuilder sb=new StringBuilder();
      int pos=0;
      int index=string.indexOf(from);
      int patLen=from.length();
      while (index >= 0) {
        sb.append(string.substring(pos,index));
        sb.append(to);
        pos=index + patLen;
        index=string.indexOf(from,pos);
      }
      sb.append(string.substring(pos));
      return sb.toString();
    }
}
