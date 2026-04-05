package unverified;

public class ClonePair2044 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(3 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
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
