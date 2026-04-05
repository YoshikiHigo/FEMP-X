package unverified;

public class ClonePair12654 {

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

    int method2(String integer){
      if (integer.equals("")) {
        return 0;
      }
      return Integer.valueOf(integer).intValue();
    }
}
