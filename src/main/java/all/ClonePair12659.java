package all;

public class ClonePair12659 {

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

    int method2(String toInt){
      if (toInt.equals(""))   return 0;
     else   return new Integer(toInt);
    }
}
