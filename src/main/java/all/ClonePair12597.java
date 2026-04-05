package all;

public class ClonePair12597 {

    boolean method1(int read,int prevRead,int dt){
      if (dt > 0 && read < 0 && prevRead > 0)   return true;
      if (dt < 0 && read > 0 && prevRead < 0)   return true;
      return false;
    }

    boolean method2(int read,int prevRead,int dt){
      if (dt > 0 && read < 0 && prevRead > 0) {
        return true;
      }
      if (dt < 0 && read > 0 && prevRead < 0) {
        return true;
      }
      return false;
    }
}
