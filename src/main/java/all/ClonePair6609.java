package all;

public class ClonePair6609 {

    int method1(int val,int width){
      if (val % width == 0)   return val;
      return val + (width - (val % width));
    }

    int method2(int length,int i){
      int r=length / i * i;
      if (r != length)   r+=i;
      return r;
    }
}
