package unverified;

public class ClonePair9297 {

    String method1(String source,String str1,String str2){
      int index, start=0;
      StringBuffer value=new StringBuffer();
      while ((index=source.indexOf(str1,start)) != -1) {
        value.append(source.substring(start,index) + str2);
        start=index + str1.length();
      }
      if (start < source.length()) {
        value.append(source.substring(start,source.length()));
      }
      return value.toString();
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
