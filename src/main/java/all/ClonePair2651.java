package all;

public class ClonePair2651 {

    int method1(byte[] dataArray){
      int result=0;
      int k=0;
      for (int i=24; i >= 0; i-=8) {
        result|=((int)(dataArray[k] & 0xff)) << i;
        k++;
      }
      return result;
    }

    int method2(byte[] b){
      int mask=0xff;
      int temp=0;
      int n=0;
      for (int i=0; i < 4; i++) {
        n<<=8;
        temp=b[i] & mask;
        n|=temp;
      }
      return n;
    }
}
