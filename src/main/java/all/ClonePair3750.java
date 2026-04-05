package all;

public class ClonePair3750 {

    boolean method1(double[] p_D0,double[] p_D1,double p_Epsilon){
      if (p_D0 == p_D1) {
        return true;
      }
      if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
        return false;
      }
      if (p_Epsilon < 0)   p_Epsilon=-p_Epsilon;
      for (int i=0; i < p_D0.length; i++) {
        if (Math.abs(p_D0[i] - p_D1[i]) > p_Epsilon) {
          return false;
        }
      }
      return true;
    }

    boolean method2(double[] _t,double[] _t2,double _epsilon){
      if (_t == _t2) {
        return true;
      }
      if (_t == null || _t2 == null) {
        return false;
      }
      final int length=_t.length;
      if (_t2.length != length) {
        return false;
      }
      final double epsilonAbs=Math.abs(_epsilon);
      for (int i=0; i < length; i++) {
        if (Math.abs(_t[i] - _t2[i]) > epsilonAbs) {
          return false;
        }
      }
      return true;
    }
}
