package unverified;

public class ClonePair2902 {

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
      try {
        if (value == null || value.length() == 0) {
          return 0;
        }
     else {
          return Double.parseDouble(value);
        }
      }
     catch (  Exception e) {
        return 0;
      }
    }
}
