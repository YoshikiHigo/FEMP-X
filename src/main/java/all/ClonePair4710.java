package all;

public class ClonePair4710 {

    boolean method1(int s){
      boolean t=false;
    switch (s) {
    case 1:case 2:case 3:case 4:case 5:case 6:    t=true;
      break;
    default:t=false;
    }
    return t;
    }

    boolean method2(int ascii){
      if (ascii > 0 && ascii < 160) {
        return true;
      }
      return false;
    }
}
