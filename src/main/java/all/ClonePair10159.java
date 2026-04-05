package all;

public class ClonePair10159 {

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

    String method2(String text,String expr,String replaceSting){
      if (text == null) {
        return text;
      }
      if (expr == null) {
        return text;
      }
      if (replaceSting == null) {
        return text;
      }
      if (text.equals("")) {
        return text;
      }
      if (expr.equals("")) {
        return text;
      }
      if (text.indexOf(expr) == -1) {
        return text;
      }
      String vAfter=text;
      StringBuffer buf=new StringBuffer();
      while (vAfter.indexOf(expr) != -1) {
        String vBefor=vAfter.substring(0,vAfter.indexOf(expr));
        vAfter=vAfter.substring(vAfter.indexOf(expr) + expr.length());
        buf.append(vBefor).append(replaceSting);
      }
      buf.append(vAfter);
      text=buf.toString();
      return text;
    }
}
