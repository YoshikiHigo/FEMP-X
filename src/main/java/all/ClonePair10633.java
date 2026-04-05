package all;

public class ClonePair10633 {

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

    String method2(String destination,String what,String with){
      if (destination.indexOf(what) >= 0) {
        StringBuffer buf=new StringBuffer();
        int last=0;
        int current=destination.indexOf(what);
        int whatLength=what.length();
        while (current >= 0) {
          if (current > 0) {
            buf.append(destination.substring(last,current));
          }
          buf.append(with);
          last=current + whatLength;
          current=destination.indexOf(what,last);
        }
        if (destination.length() > last) {
          buf.append(destination.substring(last));
        }
        return buf.toString();
      }
      return destination;
    }
}
