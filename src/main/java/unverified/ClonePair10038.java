package unverified;

public class ClonePair10038 {

    int method1(byte[] data,int pos,int size){
      int retVal=0;
      int shifter=(size - 1) * 8;
      while (size > 0) {
        retVal+=(data[pos] & 0xff) << shifter;
        shifter-=8;
        pos++;
        size--;
      }
      return retVal;
    }

    int method2(byte[] p,int off,int len){
      int ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }
}
