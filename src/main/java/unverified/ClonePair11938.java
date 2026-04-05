package unverified;

public class ClonePair11938 {

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

    String method2(String in,String old,String neww){
      int b=0;
      if (in == null || old == null || neww == null || (b=in.indexOf(old)) == -1 || old.length() == 0) {
        return in;
      }
      int oldLength=old.length();
      StringBuffer mod=new StringBuffer(in.length());
      mod.append(in.substring(0,b));
      int e=in.indexOf(old,b + oldLength);
      while (e != -1) {
        mod.append(neww);
        mod.append(in.substring(b + oldLength,e));
        b=e;
        e=in.indexOf(old,b + oldLength);
      }
      mod.append(neww);
      if (b < in.length()) {
        mod.append(in.substring(b + oldLength));
      }
      return mod.toString();
    }
}
