package unverified;

public class ClonePair11948 {

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

    String method2(String sTarget,String sSubstring,String sReplaceWith){
      if ((sTarget != null) && (sSubstring != null)) {
        if (sReplaceWith == null) {
          sReplaceWith="";
        }
        int len=sTarget.length();
        int searchlen=sSubstring.length();
        int replacelen=sReplaceWith.length();
        StringBuffer result=null;
        int pos=0;
        int lastPos=0;
        while ((pos=sTarget.indexOf(sSubstring,lastPos)) > -1) {
          if (result == null) {
            result=new StringBuffer(len);
          }
          result.append(sTarget.substring(lastPos,pos));
          if (replacelen > 0) {
            result.append(sReplaceWith);
          }
          lastPos=pos + searchlen;
        }
        if (result != null) {
          if (lastPos < len) {
            result.append(sTarget.substring(lastPos));
          }
          return result.toString();
        }
      }
      return sTarget;
    }
}
