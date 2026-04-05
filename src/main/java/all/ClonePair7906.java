package all;

public class ClonePair7906 {

    boolean method1(int[] ids,int pos){
      if (pos < 0 || pos >= ids.length)   return false;
      int id=ids[pos];
      for (int i=0; i < pos; i++) {
        if (id == ids[i])     return false;
      }
      return true;
    }

    boolean method2(int[] ids,int pos){
      if (pos < 0 || pos >= ids.length) {
        return false;
      }
      int id=ids[pos];
      for (int i=0; i < pos; i++) {
        if (id == ids[i]) {
          return false;
        }
      }
      return true;
    }
}
