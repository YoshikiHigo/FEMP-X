package unverified;

public class ClonePair13454 {

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
