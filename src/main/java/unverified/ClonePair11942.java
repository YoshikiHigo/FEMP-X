package unverified;

public class ClonePair11942 {

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

    String method2(String str,String search,String replacement){
      String result=str;
      if (str != null && search != null) {
        final int strLen=str.length();
        final int searchLen=search.length();
        if (strLen > 0 && searchLen > 0) {
          final StringBuffer buf=new StringBuffer(strLen);
          int searchIdx=0;
          int foundIdx=0;
          while (searchIdx < strLen) {
            if ((foundIdx=str.indexOf(search,searchIdx)) != -1) {
              buf.append(str.substring(searchIdx,foundIdx));
              searchIdx=foundIdx + searchLen;
              if (replacement != null && replacement.length() > 0) {
                buf.append(replacement);
              }
            }
     else {
              buf.append(str.substring(searchIdx));
              searchIdx=strLen;
            }
          }
          result=buf.toString();
        }
      }
      return result;
    }
}
