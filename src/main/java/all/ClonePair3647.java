package all;

public class ClonePair3647 {

    float[] method1(float[] v){
      float r;
      r=(float)Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
      if (r == 0.0) {
        return v;
      }
      r=1.0f / r;
      v[0]*=r;
      v[1]*=r;
      v[2]*=r;
      return v;
    }

    float[] method2(float[] v){
      float r;
      r=(float)Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
      if (r == 0.0)   return v;
      r=1.0f / r;
      v[0]*=r;
      v[1]*=r;
      v[2]*=r;
      return v;
    }
}
