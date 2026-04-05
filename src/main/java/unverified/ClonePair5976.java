package unverified;

public class ClonePair5976 {

    float method1(String _data){
      try {
        if (_data == null || _data.length() <= 0)     return 0;
        return Float.parseFloat(_data);
      }
     catch (  Exception err) {
        return 0;
      }
    }

    float method2(String s){
      if (s == null || s.isEmpty()) {
        return 0.0f;
      }
      try {
        return Float.parseFloat(s);
      }
     catch (  Throwable t) {
        return 0.0f;
      }
    }
}
