package all;

public class ClonePair2486 {

    int method1(byte[] arr){
      int i=0x00000000, j;
      for (j=0; j < 4; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
    }

    int method2(byte[] data){
      int number;
      number=0;
      for (int i=0; i < 4; ++i) {
        number|=(data[3 - i] & 0xff) << (i << 3);
      }
      return number;
    }
}
