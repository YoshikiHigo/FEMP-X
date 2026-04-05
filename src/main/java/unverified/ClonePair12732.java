package unverified;

public class ClonePair12732 {

    short method1(byte[] data,int offset){
      int result=0;
      int multiply=1;
      int value=0;
      for (int i=0; i < 2; i++) {
        value=data[i + offset];
        if (value < 0)     value=value + 256;
        result=result + (value * multiply);
        multiply=multiply * 256;
      }
      return (short)result;
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
