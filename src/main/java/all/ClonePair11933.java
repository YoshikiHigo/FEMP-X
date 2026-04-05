package all;

public class ClonePair11933 {

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

    String method2(String str,String thisStr,String withThisStr){
      if ((str == null) || (thisStr == null) || (withThisStr == null)|| (str.length() == 0)|| (thisStr.length() == 0))   return str;
      for (int i=str.length() - 1; i >= 0; i--) {
        if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(thisStr.charAt(0)))     if (str.substring(i).toUpperCase().startsWith(thisStr.toUpperCase())) {
          boolean isUpperCase=Character.isUpperCase(str.charAt(i));
          if (withThisStr.length() > 0)       withThisStr=(isUpperCase ? Character.toUpperCase(withThisStr.charAt(0)) : Character.toLowerCase(withThisStr.charAt(0))) + withThisStr.substring(1);
          str=str.substring(0,i) + withThisStr + str.substring(i + thisStr.length());
        }
      }
      return str;
    }
}
