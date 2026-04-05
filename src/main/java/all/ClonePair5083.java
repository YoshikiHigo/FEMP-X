package all;

public class ClonePair5083 {

    boolean method1(int thisArray,int thisFace,int thatArray,int thatFace){
      if ((thisArray == thatArray) && (thisFace == thatFace)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int x1,int y1,int x2,int y2){
      if (x1 == x2 && y1 == y2)   return true;
      return false;
    }
}
