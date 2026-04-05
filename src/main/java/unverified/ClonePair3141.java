package unverified;

public class ClonePair3141 {

    float method1(float[] chan){
      float v=chan[0];
      for (int i=0; i < chan.length; i++)   v=Math.min(v,chan[i]);
      return v;
    }

    float method2(float[] d){
      float dmin=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] < dmin)   dmin=d[i];
      return dmin;
    }
}
