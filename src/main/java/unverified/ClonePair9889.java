package unverified;

public class ClonePair9889 {

    double method1(double input){
      double result=0;
      if (input == 2.7199999999999998) {
        result=2.72;
      }
     else   if (input == 2.7800000000000002) {
        result=2.78;
      }
     else   if (input == 3.1399999999999997) {
        result=3.14;
      }
     else   if (input == 3.6799999999999997) {
        result=3.68;
      }
     else {
        result=input;
      }
      return result;
    }

    double method2(double d){
      if ((d < 0.0000000000001) && (d > -0.0000000000001)) {
        return 0.0;
      }
      if ((d > 1000000000000.) || (d < -1000000000000.)) {
        return d;
      }
      StringBuffer s=new StringBuffer();
      s.append(d);
      int len=s.length();
      if (len < 16) {
        return d;
      }
      char cx=s.charAt(len - 1);
      char c1=s.charAt(len - 2);
      char c2=s.charAt(len - 3);
      char c3=s.charAt(len - 4);
      if ((c1 == '0') && (c2 == '0') && (c3 == '0')&& (cx != '.')) {
        s.setCharAt(len - 1,'0');
      }
     else   if ((c1 == '9') && (c2 == '9') && (c3 == '9')&& (cx != '.')) {
        s.setCharAt(len - 1,'9');
        s.append('9');
        s.append('9');
      }
      return Double.valueOf(s.toString()).doubleValue();
    }
}
