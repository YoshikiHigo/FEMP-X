package unverified;

public class ClonePair12807 {

    String method1(String text,String src,String tar){
      StringBuffer sb=new StringBuffer();
      if (text == null || src == null || tar == null) {
        return text;
      }
     else {
        int size=text.length();
        int gap=src.length();
        for (int start=0; start >= 0 && start < size; ) {
          int i=text.indexOf(src,start);
          if (i == -1) {
            sb.append(text.substring(start));
            start=-1;
          }
     else {
            sb.append(text.substring(start,i)).append(tar);
            start=i + gap;
          }
        }
        return sb.toString();
      }
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
