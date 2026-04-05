package all;

public class ClonePair2905 {

    double method1(String _data){
      try {
        if (_data == null || _data.length() <= 0)     return 0;
        return Double.parseDouble(_data);
      }
     catch (  Exception err) {
        return 0;
      }
    }

    double method2(String str){
      String loghead=new String("TypeConver:str2float:");
      double ret=0.00;
      try {
        boolean flag=(null == str);
        flag=flag || (str.trim().length() < 1);
        if (flag) {
          ret=0.00;
        }
     else {
          ret=Double.parseDouble(str);
        }
      }
     catch (  NumberFormatException e) {
        ret=0.00;
      }
      return ret;
    }
}
