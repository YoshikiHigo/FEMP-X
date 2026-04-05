package unverified;

public class ClonePair12265 {

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

    String method2(String str,String oldStr,String newStr){
      if (str == null || str.length() == 0) {
        return str;
      }
      StringBuffer buffer=new StringBuffer();
      int pos=0;
      int oldPos=0;
      while ((pos=str.indexOf(oldStr,oldPos)) != -1) {
        buffer.append(str.substring(oldPos,pos));
        buffer.append(newStr);
        oldPos=pos + oldStr.length();
      }
      buffer.append(str.substring(oldPos,str.length()));
      return buffer.toString();
    }
}
