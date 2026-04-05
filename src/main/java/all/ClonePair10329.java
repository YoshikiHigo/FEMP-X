package all;

public class ClonePair10329 {

    int method1(byte[] p,int off,int len){
      int ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }

    int method2(byte[] buff,int off,int len){
      int num=0;
      int shift=0;
      for (int i=off + len - 1; i >= off; i--) {
        num+=(buff[i] & 0xFF) << shift;
        shift+=8;
      }
      return num;
    }
}
