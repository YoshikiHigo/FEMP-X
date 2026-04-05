package unverified;

public class ClonePair11935 {

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

    String method2(String text,String replace,String replaceTo){
      if (text == null || replace == null || replaceTo == null || replace.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int searchFrom=0;
      while (true) {
        int foundAt=text.indexOf(replace,searchFrom);
        if (foundAt == -1) {
          break;
        }
        buf.append(text.substring(searchFrom,foundAt)).append(replaceTo);
        searchFrom=foundAt + replace.length();
      }
      buf.append(text.substring(searchFrom));
      return buf.toString();
    }
}
