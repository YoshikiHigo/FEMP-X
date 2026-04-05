package all;

public class ClonePair11940 {

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

    String method2(String src,String from,String to){
      if (src == null)   return null;
      if (from == null)   return src;
      if (to == null)   to="";
      StringBuffer buf=new StringBuffer();
      for (int pos; (pos=src.indexOf(from)) >= 0; ) {
        buf.append(src.substring(0,pos));
        buf.append(to);
        src=src.substring(pos + from.length());
      }
      buf.append(src);
      return buf.toString();
    }
}
