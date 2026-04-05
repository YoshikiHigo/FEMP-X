package unverified;

public class ClonePair13470 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
    }

    String method2(String orig,String vieja,String nueva){
      int oldind=0, newind=0;
      String retval="";
      if (orig == null)   return null;
      for (; ; ) {
        oldind=newind;
        newind=orig.indexOf(vieja,oldind);
        if (newind >= 0) {
          retval+=orig.substring(oldind,newind);
          retval+=nueva;
          newind+=vieja.length();
        }
     else {
          retval+=orig.substring(oldind);
          return retval;
        }
      }
    }
}
