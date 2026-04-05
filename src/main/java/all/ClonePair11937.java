package all;

public class ClonePair11937 {

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

    String method2(String s,String f,String r){
      if (s == null)   return s;
      if (f == null)   return s;
      if (r == null)   r="";
      int index01=s.indexOf(f);
      while (index01 != -1) {
        s=s.substring(0,index01) + r + s.substring(index01 + f.length());
        index01+=r.length();
        index01=s.indexOf(f,index01);
      }
      return s;
    }
}
