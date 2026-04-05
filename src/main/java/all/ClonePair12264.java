package all;

public class ClonePair12264 {

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

    String method2(String source,String oldString,String newString){
      if (source == null)   return null;
      StringBuffer output=new StringBuffer();
      int lengOfsource=source.length();
      int lengOfold=oldString.length();
      int posStart=0;
      int pos;
      while ((pos=source.indexOf(oldString,posStart)) >= 0) {
        output.append(source.substring(posStart,pos));
        output.append(newString);
        posStart=pos + lengOfold;
      }
      if (posStart < lengOfsource) {
        output.append(source.substring(posStart));
      }
      return output.toString();
    }
}
