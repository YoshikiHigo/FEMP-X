package all;

public class ClonePair11939 {

    String method1(String ent,String proc,String strocar){
      String trocar;
      if (ent == null) {
        return null;
      }
      if (ent.equals("")) {
        return new String();
      }
      if ((proc == null) || (proc.equals(""))) {
        return new String(ent);
      }
      if (strocar == null) {
        trocar=new String();
      }
     else {
        trocar=strocar;
      }
      StringBuffer sb=new StringBuffer(ent);
      int fi=0;
      int larg=proc.length();
      int larg2=trocar.length();
      int local=sb.indexOf(proc,fi);
      while (local != -1) {
        sb.delete(local,local + larg);
        sb.insert(local,trocar);
        fi=local + larg2;
        local=sb.indexOf(proc,fi);
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
