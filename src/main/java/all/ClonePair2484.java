package all;

public class ClonePair2484 {

    int method1(byte[] arr){
      int i=0x00000000, j;
      for (j=0; j < 4; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
    }

    int method2(byte[] dataArray){
      int result=0;
      int k=0;
      for (int i=24; i >= 0; i-=8) {
        result|=((int)(dataArray[k] & 0xff)) << i;
        k++;
      }
      return result;
    }
}
