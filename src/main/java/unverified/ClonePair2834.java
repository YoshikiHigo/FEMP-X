package unverified;

public class ClonePair2834 {

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

    double method2(String TextString){
      double d=0;
      TextString=TextString.replaceAll(",","");
      String TempString="";
      TempString=TextString.replaceAll("-","");
      if (!TempString.trim().equals(""))   try {
        d=Double.parseDouble(TextString);
      }
     catch (  Exception ex) {
        d=0;
      }
      return d;
    }
}
