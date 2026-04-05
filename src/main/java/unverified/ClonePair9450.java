package unverified;

public class ClonePair9450 {

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

    String method2(String value,String src,String dest){
      StringBuffer result=new StringBuffer();
      int pos=0;
      int index=value.indexOf(src);
      while (index >= 0) {
        if (index > pos)     result.append(value.substring(pos,index - 1));
        result.append(dest);
        pos=pos + src.length();
        index=value.indexOf(src,index + dest.length());
      }
      result.append(value.substring(pos));
      return result.toString();
    }
}
