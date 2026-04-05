package unverified;

public class ClonePair12928 {

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

    String method2(String s,int desiredLength){
      int len=s.length();
      if (len == desiredLength)   return s;
      if (len > desiredLength)   return s.substring(0,desiredLength);
      StringBuffer sb=new StringBuffer(s);
      for (int i=len; i < desiredLength; i++)   sb.append(' ');
      return sb.toString();
    }
}
