package all;

public class ClonePair2828 {

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

    double method2(String s){
      double res=0;
      try {
        if (s.equals(""))     return 0;
        res=Double.parseDouble(s.trim());
      }
     catch (  NumberFormatException nfe) {
        System.out.println("NumberFormatException: " + nfe.getMessage());
      }
      return res;
    }
}
