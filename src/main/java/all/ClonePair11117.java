package all;

public class ClonePair11117 {

    String method1(String str,String oldVal,String newVal){
      String res=str;
      if (str.length() > 0) {
        int pos=str.indexOf(oldVal);
        if (pos >= 0) {
          res=str.substring(0,pos);
          res=res.concat(newVal);
          res=res.concat(str.substring(pos + oldVal.length()));
          return res;
        }
      }
      return res;
    }

    String method2(String orig,String token,String replacement){
      if (orig.indexOf(token) < 0)   return orig;
      int tokenlen=token.length();
      int posn;
      String result="";
      while ((posn=orig.indexOf(token)) >= 0) {
        result+=orig.substring(0,posn) + replacement;
        orig=orig.substring(posn + tokenlen);
      }
      return result + orig;
    }
}
