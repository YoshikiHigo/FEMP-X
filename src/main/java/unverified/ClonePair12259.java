package unverified;

public class ClonePair12259 {

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

    String method2(String orig,String src,String dest){
      if (orig == null)   return null;
      StringBuffer res=new StringBuffer();
      int start=0;
      int end=0;
      int last=0;
      String origCaseUnsn=orig.toLowerCase();
      String srcCaseUnsn=src.toLowerCase();
      while ((start=origCaseUnsn.indexOf(srcCaseUnsn,end)) != -1) {
        res.append(orig.substring(last,start));
        res.append(dest);
        end=start + src.length();
        last=start + src.length();
      }
      res.append(orig.substring(end));
      return res.toString();
    }
}
