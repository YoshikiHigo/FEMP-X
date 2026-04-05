package all;

public class ClonePair4252 {

    boolean method1(float[] v1,float[] v2){
      if (Float.compare(v1[0],v2[0]) == 0 && Float.compare(v1[1],v2[1]) == 0 && Float.compare(v1[2],v2[2]) == 0)   return true;
      return false;
    }

    boolean method2(float[] v1,float[] v2){
      if (v1[0] != v2[0] || v1[1] != v2[1] || v1[2] != v2[2])   return false;
      return true;
    }
}
