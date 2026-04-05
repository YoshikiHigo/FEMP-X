package all;

public class ClonePair5978 {

    float method1(String _data){
      try {
        if (_data == null || _data.length() <= 0)     return 0;
        return Float.parseFloat(_data);
      }
     catch (  Exception err) {
        return 0;
      }
    }

    float method2(String param){
      if (param == null || param.trim().equals("")) {
        return 0f;
      }
      try {
        return Float.parseFloat(param);
      }
     catch (  NumberFormatException e) {
        e.printStackTrace();
        return 0f;
      }
    }
}
