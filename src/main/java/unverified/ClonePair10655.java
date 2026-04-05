package unverified;

public class ClonePair10655 {

    String method1(String old,String substring1,String substring2){
      StringBuffer returnBuffer=new StringBuffer();
      int len0=old.length();
      int len1=substring1.length();
      if (len1 > len0)   return new String(old);
     else {
        int exti=0;
        for (int i=0; i < len0 - len1 + 1; i++) {
          if (old.regionMatches(i,substring1,0,len1)) {
            returnBuffer.append(substring2);
            i+=len1 - 1;
          }
     else {
            returnBuffer.append(old.charAt(i));
          }
          exti=i;
        }
        for (int i=exti + 1; i < len0; i++) {
          returnBuffer.append(old.charAt(i));
        }
        return new String(returnBuffer);
      }
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
