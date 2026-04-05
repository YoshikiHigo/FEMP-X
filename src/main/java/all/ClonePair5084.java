package all;

public class ClonePair5084 {

    boolean method1(int thisArray,int thisFace,int thatArray,int thatFace){
      if ((thisArray == thatArray) && (thisFace == thatFace)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int t1Start,int t1End,int t2Start,int t2End){
      if (t1Start == t2Start && t1End == t2End) {
        return true;
      }
     else {
        return false;
      }
    }
}
