package all;

public class ClonePair2899 {

    double method1(String _data){
      try {
        if (_data == null || _data.length() <= 0)     return 0;
        return Double.parseDouble(_data);
      }
     catch (  Exception err) {
        return 0;
      }
    }

    double method2(String value){
      if (value == null || value.length() == 0)   return 0;
      double d=0;
      try {
        d=Double.parseDouble(value);
      }
     catch (  Exception e) {
        d=0;
      }
      return d;
    }
}
