package all;

public class ClonePair12255 {

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

    String method2(String original,String replace,String with){
      if (original == null) {
        return original;
      }
      final int len=replace.length();
      StringBuffer sb=new StringBuffer(original.length());
      int start=0;
      int found=-1;
      while ((found=original.indexOf(replace,start)) != -1) {
        sb.append(original.substring(start,found));
        sb.append(with);
        start=found + len;
      }
      sb.append(original.substring(start));
      return sb.toString();
    }
}
