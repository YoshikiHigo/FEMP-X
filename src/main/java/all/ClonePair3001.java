package all;

public class ClonePair3001 {

    double method1(String s){
      int p=s.indexOf(".");
      if (p >= 0) {
        p=s.indexOf(".",p + 1);
      }
      if (p >= 0) {
        s=s.substring(0,p);
      }
      double d=0.0;
      try {
        d=Double.parseDouble(s);
      }
     catch (  NumberFormatException e) {
      }
      return d;
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
