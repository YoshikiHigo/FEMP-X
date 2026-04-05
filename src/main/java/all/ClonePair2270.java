package all;

public class ClonePair2270 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
    }

    int method2(byte[] arr){
      int i=0x00000000, j;
      for (j=0; j < 4; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
    }
}
