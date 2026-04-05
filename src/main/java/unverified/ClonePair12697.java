package unverified;

public class ClonePair12697 {

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
      if (value == null || value.equals(""))   return 0;
     else {
        try {
          return Integer.parseInt(value);
        }
     catch (    Exception e) {
          return 0;
        }
      }
    }
}
