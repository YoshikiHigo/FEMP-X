package all;

public class ClonePair12699 {

    int method1(String strNum){
      try {
        if (strNum == null || strNum.trim().equals("")) {
          return 0;
        }
     else {
          strNum=strNum.trim();
          strNum=strNum.replaceAll(",","");
          return Integer.parseInt(strNum);
        }
      }
     catch (  Exception ex) {
        return 0;
      }
    }

    int method2(String str){
      String loghead=new String("TypeConver:str2float:");
      int ret=0;
      try {
        boolean flag=(null == str);
        flag=flag || (str.trim().length() < 1);
        if (flag) {
          ret=0;
        }
     else {
          ret=Integer.parseInt(str);
        }
      }
     catch (  NumberFormatException e) {
        ret=0;
      }
      return ret;
    }
}
