package all;

public class ClonePair12268 {

    String method1(String strOrig,String strFind,String strReplace){
      if (strOrig == null) {
        return null;
      }
      StringBuffer sb=new StringBuffer(strOrig);
      String toReplace="";
      if (strReplace == null)   toReplace="";
     else   toReplace=strReplace;
      int pos=strOrig.length();
      while (pos > -1) {
        pos=strOrig.lastIndexOf(strFind,pos);
        if (pos > -1)     sb.replace(pos,pos + strFind.length(),toReplace);
        pos=pos - strFind.length();
      }
      return sb.toString();
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
