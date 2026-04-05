package all;

public class ClonePair4711 {

    boolean method1(int s){
      boolean t=false;
    switch (s) {
    case 1:case 2:case 3:case 4:case 5:case 6:    t=true;
      break;
    default:t=false;
    }
    return t;
    }

    boolean method2(int entityValue){
      boolean extra=false;
      if (entityValue < 128) {
    switch (entityValue) {
    case 34:case 38:case 60:case 62:      break;
    default:    extra=true;
    }
    }
    return extra;
    }
}
