package all;

public class ClonePair11124 {

    String method1(String str,String oldVal,String newVal){
      String res=str;
      if (str.length() > 0) {
        int pos=str.indexOf(oldVal);
        if (pos >= 0) {
          res=str.substring(0,pos);
          res=res.concat(newVal);
          res=res.concat(str.substring(pos + oldVal.length()));
          return res;
        }
      }
      return res;
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
