package unverified;

public class ClonePair8662 {

    int method1(double d){
      double absD=Math.abs(d);
      if (absD == 0)   return 0;
      int decPos=0;
      if (absD >= 1) {
        while (absD >= 0.999999999999) {
          absD/=10f;
          decPos++;
        }
        decPos--;
      }
     else {
        while (absD <= 0.999999999999) {
          absD*=10f;
          decPos--;
        }
      }
      return decPos;
    }

    int method2(double d){
      int i=0;
      if (d == 0.0D)   return i;
      if (Math.abs(d) >= 1.0D) {
        do {
          d/=10D;
          i++;
        }
     while (d >= 1.0D);
        return --i;
      }
      if (Math.abs(d) < 1.0D) {
        while (d < 1.0D) {
          d*=10D;
          i++;
        }
        return -i;
      }
      return i;
    }
}
