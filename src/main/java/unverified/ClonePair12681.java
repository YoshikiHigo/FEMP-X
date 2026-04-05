package unverified;

public class ClonePair12681 {

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
      int value=0;
      if (str == null || str.equals("")) {
        return 0;
      }
      try {
        value=Integer.parseInt(str);
      }
     catch (  Exception ex) {
        value=0;
        ex.printStackTrace();
      }
      return value;
    }
}
