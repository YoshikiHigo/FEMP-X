package unverified;

public class ClonePair12690 {

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
      if (str == null)   return 0;
      int integer=0;
      try {
        integer=str.charAt(0) == '#' ? Integer.parseInt(str.substring(1),16) : Integer.parseInt(str);
      }
     catch (  Exception e) {
        integer=0;
      }
      return integer;
    }
}
