package all;

public class ClonePair11932 {

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

    String method2(String s,String replaceFrom,String repalceTo){
      if (s == null || replaceFrom == null)   return s;
      if (repalceTo == null)   repalceTo="";
      StringBuffer result=new StringBuffer();
      int index=0;
      int j=0;
      while ((j=s.indexOf(replaceFrom,index)) != -1) {
        result.append(s.substring(index,j));
        result.append(repalceTo);
        index=j + replaceFrom.length();
      }
      if (index == 0) {
        return s;
      }
     else {
        result.append(s.substring(index));
        return result.toString();
      }
    }
}
