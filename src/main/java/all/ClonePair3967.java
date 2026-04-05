package all;

public class ClonePair3967 {

    int method1(byte[] data1,byte[] data2){
      for (int index=0, length=data1.length; index < length; index++) {
    switch ((int)Math.signum((data1[index] & 0xff) - (data2[index] & 0xff))) {
    case -1:      return -1;
    case 1:    return 1;
    }
    }
    return 0;
    }

    int method2(byte[] a,byte[] b){
      int d=0;
      for (int i=0; i < a.length; i++) {
        d=(a[i] & 0xFF) - (b[i] & 0xFF);
        if (d < 0) {
          return -1;
        }
     else     if (d > 0) {
          return 1;
        }
      }
      return 0;
    }
}
