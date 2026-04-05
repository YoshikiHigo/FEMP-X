package all;

public class ClonePair3152 {

    float method1(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.max(v,chan[i]);
      return v;
    }

    float method2(float[] d){
      float dmax=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] > dmax)   dmax=d[i];
      return dmax;
    }
}
