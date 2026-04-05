package unverified;

public class ClonePair9491 {

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

    String method2(String line,String from,String to){
      StringBuffer res=new StringBuffer(line.length());
      String tmpstr;
      int ind=-1, lastind=0;
      while ((ind=line.indexOf(from,ind + 1)) != -1) {
        if (lastind < ind) {
          tmpstr=line.substring(lastind,ind);
          res.append(tmpstr);
        }
        res.append(to);
        lastind=ind + from.length();
        ind+=from.length() - 1;
      }
      if (lastind == 0)   return line;
      res.append(line.substring(lastind));
      return res.toString();
    }
}
