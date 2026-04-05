package all;

public class ClonePair3937 {

    int method1(byte[] o1,byte[] o2){
      for (int i=0; i < o1.length && i < o2.length; i++) {
        int b1=0xFF & o1[i];
        int b2=0xFF & o2[i];
        if (b1 < b2)     return -1;
     else     if (b1 > b2)     return 1;
      }
      if (o1.length < o2.length)   return -1;
     else   if (o1.length > o2.length)   return 1;
     else   return 0;
    }

    int method2(byte[] b1,byte[] b2){
      int len=Math.max(b1.length,b2.length);
      for (int i=0; i < len; ++i) {
        if (i == b1.length)     return i == b2.length ? 0 : -1;
     else     if (i == b2.length)     return 1;
     else     if ((0xff & (int)b1[i]) > (0xff & (int)b2[i]))     return 1;
     else     if ((0xff & (int)b1[i]) < (0xff & (int)b2[i]))     return -1;
      }
      return 0;
    }
}
