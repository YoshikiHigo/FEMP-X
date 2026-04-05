package all;

public class ClonePair4702 {

    boolean method1(int column){
      if (column == 1 || column == 2 || column == 4)   return true;
     else   return false;
    }

    boolean method2(int ascii){
      if (ascii > 0 && ascii < 160) {
        return true;
      }
      return false;
    }
}
