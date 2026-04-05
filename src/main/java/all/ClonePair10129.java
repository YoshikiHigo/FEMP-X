package all;

public class ClonePair10129 {

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

    String method2(String src,String from,String to){
      StringBuffer res_Buff=new StringBuffer();
      int pos=-1;
      if (src == null || from == null || from.equals(""))   return src;
      if (to == null)   to="";
      while (true) {
        if ((pos=src.indexOf(from)) == -1) {
          res_Buff.append(src);
          break;
        }
        res_Buff.append(src.substring(0,pos)).append(to);
        src=src.substring(pos + from.length());
      }
      return res_Buff.toString();
    }
}
