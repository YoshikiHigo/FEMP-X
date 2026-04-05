package all;

public class ClonePair8916 {

    long method1(byte data[],int offset,int length){
      long out=0;
      for (int i=offset; i < offset + length; i++) {
        out=out << 8;
        out|=(0xFF & data[i]);
      }
      return out;
    }

    long method2(byte ar[],int from,int size){
      long res=0;
      byte temp;
      for (int i=0; i < size; i++) {
        temp=ar[from + i];
        res=(res << 8) | (((long)temp) & 0xFF);
      }
      return res;
    }
}
