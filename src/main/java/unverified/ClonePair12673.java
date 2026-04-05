package unverified;

public class ClonePair12673 {

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
      value=value.trim();
      if (value == null || value.equals(""))   return 0;
      return Integer.parseInt(value);
    }
}
