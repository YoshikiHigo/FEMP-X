package all;

public class ClonePair11925 {

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

    String method2(String inputString,String subString,String replaceString){
      StringBuffer result=null;
      int fi=0;
      int si=0;
      String retval=null;
      if (inputString != null) {
        inputString=inputString.trim();
        result=new StringBuffer(inputString.length());
        if (subString != null && replaceString != null) {
          subString=subString.trim();
          replaceString=replaceString.trim();
          while ((si=inputString.indexOf(subString,fi)) >= 0) {
            result.append(inputString.substring(fi,si));
            result.append(replaceString);
            fi=si + subString.length();
          }
          if (fi < inputString.length()) {
            result.append(inputString.substring(fi));
          }
        }
     else {
          result.append(inputString);
        }
        retval=result.toString();
      }
      return retval;
    }
}
