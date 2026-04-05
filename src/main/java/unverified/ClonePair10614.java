package unverified;

public class ClonePair10614 {

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

    String method2(String text,String a,String b){
      int length=text.length();
      int lenA=a.length();
      int lenB=b.length();
      int gofrom=0;
      boolean goon=true;
      while (goon) {
        int next=text.indexOf(a,gofrom);
        if (next != -1) {
          if (next + lenA > length) {
            text=text.substring(0,next) + b;
          }
     else {
            text=text.substring(0,next) + b + text.substring(next + lenA);
          }
          gofrom=next + lenB;
        }
     else {
          goon=false;
        }
        length=text.length();
        if (gofrom > length)     goon=false;
      }
      return text;
    }
}
