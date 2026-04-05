package unverified;

public class ClonePair2550 {

    int method1(byte[] b){
      int a=0;
      for (int i=3; i >= 0; i--) {
        a+=(b[3 - i] & 0xFF) << (i * 8);
      }
      return a;
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
