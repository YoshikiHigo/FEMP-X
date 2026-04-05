package unverified;

public class ClonePair12282 {

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

    String method2(String subject,String find,String replace){
      if (subject == null)   return null;
      StringBuffer buf=new StringBuffer();
      int l=find.length();
      int s=0;
      int i=subject.indexOf(find);
      while (i != -1) {
        buf.append(subject.substring(s,i));
        buf.append(replace);
        s=i + l;
        i=subject.indexOf(find,s);
      }
      buf.append(subject.substring(s));
      return buf.toString();
    }
}
