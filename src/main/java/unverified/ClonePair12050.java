package unverified;

public class ClonePair12050 {

    String method1(String source,String mark,String toMark){
      String result=source;
      int p=0;
      while (source != null && mark != null && toMark != null) {
        p=result.indexOf(mark,p);
        if (p == -1) {
          break;
        }
        result=result.substring(0,p) + toMark + result.substring(p + mark.length());
        p+=toMark.length();
      }
      return result;
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
