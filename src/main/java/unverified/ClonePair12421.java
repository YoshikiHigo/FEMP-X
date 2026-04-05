package unverified;

public class ClonePair12421 {

    String method1(String p_Value,String p_SearchString,String p_ReplaceString){
      if (p_Value == null)   return null;
      StringBuffer buf=new StringBuffer(p_Value.length());
      int len=p_SearchString.length();
      int off=0;
      int index=0;
      if ((index=p_Value.indexOf(p_SearchString,off)) >= 0) {
        buf.append(p_Value.substring(off,index));
        buf.append(p_ReplaceString);
        off=index + len;
      }
      buf.append(p_Value.substring(off));
      return buf.toString();
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
