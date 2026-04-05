package unverified;

public class ClonePair24121 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
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
