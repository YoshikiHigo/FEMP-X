package unverified;

public class ClonePair12635 {

    int method1(String string){
      int sex;
      if (string.equals("")) {
        sex=0;
      }
     else {
        sex=Integer.parseInt(string);
      }
      return sex;
    }

    int method2(String value){
      value=value.replaceAll("　","");
      value=value.replaceAll(" ","");
      if (null != value && value.length() > 0) {
        return Integer.parseInt(value);
      }
     else {
        return 0;
      }
    }
}
