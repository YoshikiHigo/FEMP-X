package all;

public class ClonePair9482 {

    int method1(int val){
      if (val > 32767)   val=32767;
      if (val < -32768)   val=-32768;
      if (val < 0)   val=val | 0x8000;
      return val;
    }

    int method2(int sample){
      if (sample > 32767) {
        return 0x7fff;
      }
      if (sample < -32768) {
        return 0xffff8000;
      }
      return sample;
    }
}
