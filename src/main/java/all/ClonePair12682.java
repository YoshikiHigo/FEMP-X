package all;

public class ClonePair12682 {

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
      if (str == null || str.trim().equals("")) {
        return 0;
      }
      try {
        int res=Integer.parseInt(str.trim());
        return res;
      }
     catch (  NumberFormatException e) {
        return 0;
      }
    }
}
