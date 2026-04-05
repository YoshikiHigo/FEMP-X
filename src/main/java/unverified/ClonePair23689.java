package unverified;

public class ClonePair23689 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
      return sb.toString();
    }

    String method2(String s,String f,String r){
      if (s == null)   return s;
      if (f == null)   return s;
      if (r == null)   r="";
      int index01=s.indexOf(f);
      while (index01 != -1) {
        s=s.substring(0,index01) + r + s.substring(index01 + f.length());
        index01+=r.length();
        index01=s.indexOf(f,index01);
      }
      return s;
    }
}
