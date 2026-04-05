package all;

public class ClonePair12931 {

    String method1(String s,int length){
      if (s.length() < length) {
        StringBuffer str=new StringBuffer(s);
        for (int i=0; i < length - s.length(); i++) {
          str.append(" ");
        }
        s=str.toString();
      }
     else   if (s.length() > length) {
        s=s.substring(0,length);
      }
      return s;
    }

    String method2(String str,int len){
      if (str.length() > len)   return str.substring(0,len);
      for (int i=str.length(); i < len; i++)   str+="&nbsp;";
      return str;
    }
}
