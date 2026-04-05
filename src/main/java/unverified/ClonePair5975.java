package unverified;

public class ClonePair5975 {

    float method1(String _data){
      try {
        if (_data == null || _data.length() <= 0)     return 0;
        return Float.parseFloat(_data);
      }
     catch (  Exception err) {
        return 0;
      }
    }

    float method2(String in){
      if (in == null || in.length() == 0)   return 0;
      try {
        return Float.parseFloat(in);
      }
     catch (  Exception e) {
        return 0;
      }
    }
}
