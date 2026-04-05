package unverified;

public class ClonePair12680 {

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

    int method2(String the_str){
      int res=0;
      if ((the_str == null) || (the_str.trim().length() < 1)) {
        return res;
      }
      try {
        res=Integer.decode(the_str.trim()).intValue();
      }
     catch (  Exception ex) {
        res=0;
      }
      return res;
    }
}
