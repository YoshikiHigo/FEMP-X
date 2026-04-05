package unverified;

public class ClonePair10120 {

    double method1(double d){
      if ((d < 0.0000000000001) && (d > -0.0000000000001)) {
        return 0.0;
      }
      if ((d > 1000000000000.) || (d < -1000000000000.)) {
        return d;
      }
      StringBuilder s=new StringBuilder();
      s.append(d);
      if (s.toString().indexOf("E") >= 0) {
        return d;
      }
      int len=s.length();
      if (len < 16) {
        return d;
      }
      if (s.toString().indexOf(".") > len - 3) {
        return d;
      }
      s.delete(len - 2,len);
      len-=2;
      char c1=s.charAt(len - 2);
      char c2=s.charAt(len - 3);
      char c3=s.charAt(len - 4);
      if ((c1 == '0') && (c2 == '0') && (c3 == '0')) {
        s.setCharAt(len - 1,'0');
      }
     else   if ((c1 == '9') && (c2 == '9') && (c3 == '9')) {
        s.setCharAt(len - 1,'9');
        s.append('9');
        s.append('9');
        s.append('9');
      }
      return Double.valueOf(s.toString()).doubleValue();
    }

    double method2(double input){
      double thresh=0.0001;
      if ((input > 0 && input < thresh) || (input < 0 && input > -thresh)) {
        return 0;
      }
     else {
        return input;
      }
    }
}
