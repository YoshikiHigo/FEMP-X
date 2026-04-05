package all;

public class ClonePair9437 {

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

    String method2(String str,String f_s,String t_s){
      int pos=0;
      String res="";
      while (pos < str.length()) {
        int p1=str.indexOf(f_s,pos);
        if (p1 == -1) {
          res+=str.substring(pos);
          break;
        }
        res+=str.substring(pos,p1) + t_s;
        pos=p1 + f_s.length();
      }
      return (res);
    }
}
