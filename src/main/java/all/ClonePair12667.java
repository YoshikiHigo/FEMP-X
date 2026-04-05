package all;

public class ClonePair12667 {

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
      if (value.equals(""))   return 0;
      return Integer.parseInt(value);
    }
}
