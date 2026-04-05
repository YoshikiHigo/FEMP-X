package all;

public class ClonePair10144 {

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

    String method2(String source,String match,String newData){
      if (source == null)   return null;
      if (match == null)   return source;
      if (newData == null)   newData="";
      while (source.indexOf(match) >= 0) {
        int begin=source.indexOf(match);
        int end=match.length() + begin;
        if (begin >= 0 && end >= 0) {
          source=source.substring(0,begin) + newData + source.substring(end);
        }
      }
      return source;
    }
}
