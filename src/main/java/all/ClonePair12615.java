package all;

public class ClonePair12615 {

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

    int method2(String s){
      if (s.equals(""))   return 0;
     else   return Integer.parseInt(s);
    }
}
