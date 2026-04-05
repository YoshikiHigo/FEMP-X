package all;

public class ClonePair10534 {

    int method1(byte[] data,int pos,int size){
      int retVal=0;
      int shifter=0;
      while (size > 0) {
        retVal+=(data[pos] & 0xff) << shifter;
        shifter+=8;
        pos++;
        size--;
      }
      return retVal;
    }

    int method2(byte[] bytes,int pos,int cnt){
      int value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt + i - cnt] & 0xff) << 8 * i);
      return value;
    }
}
