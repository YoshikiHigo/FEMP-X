package all;

public class ClonePair2839 {

    double method1(String _data){
      double t=0D;
      String data=_data;
      if (data.indexOf('d') > 0) {
        data=_data.replace('d','E');
      }
      if (data.indexOf('D') > 0) {
        data=_data.replace('D','E');
      }
      try {
        t=Double.parseDouble(data);
      }
     catch (  final NumberFormatException e) {
      }
      return t;
    }

    double method2(String str){
      double val=0;
      try {
        if (str.length() > 0)     val=Double.parseDouble(str);
      }
     catch (  NumberFormatException e) {
      }
      return val;
    }
}
