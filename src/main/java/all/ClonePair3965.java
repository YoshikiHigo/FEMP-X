package all;

public class ClonePair3965 {

    int method1(byte[] a,byte[] b){
      for (int i=0; i < a.length; ++i) {
        if (a[i] > b[i]) {
          return 1;
        }
     else     if (a[i] < b[i]) {
          return -1;
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
