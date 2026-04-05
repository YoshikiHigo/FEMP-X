package unverified;

public class ClonePair6902 {

    int method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 3); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return result;
    }

    int method2(byte[] data,int offset){
      int value=0;
      for (int i=offset + 3; i >= offset; i--) {
        value<<=8;
        value|=((int)data[i]) & 0xff;
      }
      return value;
    }
}
