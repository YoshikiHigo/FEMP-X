package all;

public class ClonePair5981 {

    float method1(String str){
      String loghead=new String("TypeConver:str2float:");
      float ret=0;
      try {
        boolean flag=(null == str);
        flag=flag || (str.trim().length() < 1);
        if (flag) {
          ret=0;
        }
     else {
          ret=Float.parseFloat(str);
        }
      }
     catch (  NumberFormatException e) {
        ret=0;
      }
      return ret;
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
