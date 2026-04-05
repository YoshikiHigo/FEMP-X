package all;

public class ClonePair3108 {

    double method1(String TextString){
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
