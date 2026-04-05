package unverified;

public class ClonePair10654 {

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

    String method2(String s,String s1,String s2){
      int i=s.length();
      int j=s1.length();
      int k=0;
      String s3=s;
      String s4="";
      do {
        if (i < j)     break;
        int l=s3.indexOf(s1,k);
        if (l == -1) {
          s4=s4 + s3.substring(k,i);
          break;
        }
        s4=s4 + s3.substring(k,l);
        s4=s4 + s2;
        s3=s3.substring(l + j,i);
        i=s3.length();
      }
     while (true);
      if (i < j)   s4=s4 + s3;
      return s4;
    }
}
