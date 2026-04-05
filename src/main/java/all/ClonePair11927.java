package all;

public class ClonePair11927 {

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

    String method2(String value,String oldPart,String newPart){
      if (value == null || value.length() == 0 || oldPart == null || oldPart.length() == 0)   return value;
      int oldPartLength=oldPart.length();
      String oldValue=value;
      StringBuffer retValue=new StringBuffer();
      int pos=oldValue.indexOf(oldPart);
      while (pos != -1) {
        retValue.append(oldValue.substring(0,pos));
        if (newPart != null && newPart.length() > 0)     retValue.append(newPart);
        oldValue=oldValue.substring(pos + oldPartLength);
        pos=oldValue.indexOf(oldPart);
      }
      retValue.append(oldValue);
      return retValue.toString();
    }
}
