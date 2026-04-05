package unverified;

public class ClonePair12693 {

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

    int method2(String value){
      try {
        if (value == null || value.length() == 0) {
          return 0;
        }
     else {
          if (value.charAt(0) == '+') {
            value=value.substring(1);
          }
          return Integer.parseInt(value);
        }
      }
     catch (  Exception e) {
        return 0;
      }
    }
}
