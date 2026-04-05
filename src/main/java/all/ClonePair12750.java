package all;

public class ClonePair12750 {

    short method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 1); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return (short)(result & 0xFFFF);
    }

    short method2(byte[] data,int offset){
      short num=0;
      for (int i=offset + 1; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
