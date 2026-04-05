package all;

public class ClonePair3197 {

    String method1(double no,int decimalCount){
      String sno=String.valueOf(no);
      int dp=sno.indexOf('.');
      if (dp == -1 || decimalCount < 0 || (dp + decimalCount + 1) > sno.length())   return sno;
     else {
        return sno.substring(0,decimalCount == 0 ? dp : dp + decimalCount + 1);
      }
    }

    String method2(double value,int limit){
      if (limit == 0) {
        return Integer.toString((int)value);
      }
      if (limit < 0) {
        return Double.toString(value);
      }
      String string=Double.toString(value);
      limit=string.indexOf(".") + limit + 1;
      if (limit < string.length()) {
        return string.substring(0,limit);
      }
     else   return string;
    }
}
