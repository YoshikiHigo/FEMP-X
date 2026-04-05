package unverified;

public class ClonePair11931 {

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

    String method2(String source,String match,String newData){
      if (source == null)   return null;
      if (match == null)   return source;
      if (newData == null)   newData="";
      while (source.indexOf(match) >= 0) {
        int begin=source.indexOf(match);
        int end=match.length() + begin;
        if (begin >= 0 && end >= 0) {
          source=source.substring(0,begin) + newData + source.substring(end);
        }
      }
      return source;
    }
}
