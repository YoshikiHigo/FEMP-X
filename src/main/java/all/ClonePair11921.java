package all;

public class ClonePair11921 {

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

    String method2(String data,String oldS,String newS){
      if (data == null)   return null;
      if (oldS == null || newS == null)   return data;
      StringBuffer buf=new StringBuffer(data.length());
      int pos=-1;
      int i=0;
      while ((pos=data.indexOf(oldS,i)) != -1) {
        buf.append(data.substring(i,pos)).append(newS);
        i=pos + oldS.length();
      }
      buf.append(data.substring(i));
      return buf.toString();
    }
}
