package all;

public class ClonePair12923 {

    int method1(byte mpb[],int start,int len){
      int uint=0;
      for (int i=0; i < len; i++)   uint+=mpb[i + start];
      return uint;
    }

    int method2(byte buff[],int start,int bytesLen){
      int max=start + bytesLen;
      byte bb[]=buff;
      int code=0;
      for (int i=start; i < max; i++) {
        code=code * 37 + bb[i];
      }
      return code;
    }
}
