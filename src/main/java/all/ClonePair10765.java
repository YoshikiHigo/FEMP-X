package all;

public class ClonePair10765 {

    String method1(String in,String t1,String t2){
      StringBuffer result=new StringBuffer();
      int i=0;
      while (i < in.length()) {
        if (in.startsWith(t1,i)) {
          result.append(t2);
          if (t1.length() == 0) {
            result.append(in.charAt(i));
            i++;
          }
     else       i+=t1.length();
        }
     else {
          result.append(in.charAt(i));
          i++;
        }
      }
      return result.toString();
    }

    String method2(String str,String oldVal,String newVal){
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
}
