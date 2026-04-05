package all;

public class ClonePair3142 {

    float method1(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.min(v,chan[i]);
      return v;
    }

    float method2(float[] data){
      float min=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] < min)   min=data[i];
      return min;
    }
}
