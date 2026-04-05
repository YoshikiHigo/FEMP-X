package all;

public class ClonePair11411 {

    byte method1(int v){
      if (v > 255) {
        return (byte)255;
      }
     else   if (v < 0) {
        return (byte)0;
      }
     else {
        return (byte)v;
      }
    }

    byte method2(int i){
      if (i > 255)   return -1;
      if (i < 0)   return 0;
     else   return (byte)i;
    }
}
