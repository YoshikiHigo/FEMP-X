package unverified;

public class ClonePair12691 {

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

    int method2(String _data){
      try {
        if (_data == null || _data.length() <= 0)     return 0;
        return Integer.parseInt(_data);
      }
     catch (  Exception err) {
        return 0;
      }
    }
}
