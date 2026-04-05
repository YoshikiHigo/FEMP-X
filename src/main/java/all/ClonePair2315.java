package all;

public class ClonePair2315 {

    int method1(byte[] bytes){
      int i=0;
      int j=24;
      for (int k=0; j >= 0; k++) {
        int l=bytes[k] & 0xff;
        i+=(l << j);
        j-=8;
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
