package all;

public class ClonePair10366 {

    int method1(byte[] buffer,int pos,int length){
      int value;
      int shift;
      value=shift=0;
      int i=pos;
      while (--length >= 0) {
        value+=(buffer[i++] & 0xff) << shift;
        shift+=8;
      }
      return value;
    }

    int method2(byte[] data,int pos,int size){
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
}
