package unverified;

public class ClonePair11922 {

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

    String method2(String mainString,String oldString,String newString){
      if (mainString == null) {
        return null;
      }
      if (oldString == null || oldString.length() == 0) {
        return mainString;
      }
      if (newString == null) {
        newString="";
      }
      int i=mainString.lastIndexOf(oldString);
      if (i < 0)   return mainString;
      StringBuffer mainSb=new StringBuffer(mainString);
      while (i >= 0) {
        mainSb.replace(i,i + oldString.length(),newString);
        i=mainString.lastIndexOf(oldString,i - 1);
      }
      return mainSb.toString();
    }
}
