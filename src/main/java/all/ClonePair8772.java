package all;

public class ClonePair8772 {

    int method1(int[] dest,int[] x,int len,int y){
      long yword=(long)y & 0xffffffffL;
      long carry=0;
      for (int j=0; j < len; j++) {
        carry+=((long)x[j] & 0xffffffffL) * yword;
        dest[j]=(int)carry;
        carry>>>=32;
      }
      return (int)carry;
    }

    int method2(int[] dest,int[] x,int len,int y){
      long yword=y & 0xffffffffL;
      long carry=0;
      for (int j=0; j < len; j++) {
        carry+=(x[j] & 0xffffffffL) * yword;
        dest[j]=(int)carry;
        carry>>>=32;
      }
      return (int)carry;
    }
}
