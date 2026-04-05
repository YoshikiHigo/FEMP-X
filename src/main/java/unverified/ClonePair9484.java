package unverified;

public class ClonePair9484 {

    String method1(String orig,String lookFor,String replaceWith){
      int idx=orig.indexOf(lookFor);
      if (idx < 0) {
        return (orig);
      }
      int prev=0;
      StringBuffer rtn=new StringBuffer();
      while (idx >= 0) {
        rtn.append(orig.substring(prev,idx));
        rtn.append(replaceWith);
        prev=idx + lookFor.length();
        idx=orig.indexOf(lookFor,prev);
      }
      rtn.append(orig.substring(prev,orig.length()));
      return (rtn.toString());
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
