package all;

public class ClonePair6510 {

    String method1(double x,double y,double z){
      String orientation="";
      String orientationX=(x < 0) ? "R" : "L";
      String orientationY=(y < 0) ? "A" : "P";
      String orientationZ=(z < 0) ? "F" : "H";
      double absX=Math.abs(x);
      double absY=Math.abs(y);
      double absZ=Math.abs(z);
      for (int i=0; i < 3; ++i) {
        if ((absX > 0.0001) && (absX > absY) && (absX > absZ)) {
          orientation+=orientationX;
          absX=0;
        }
     else     if ((absY > 0.0001) && (absY > absX) && (absY > absZ)) {
          orientation+=orientationY;
          absY=0;
        }
     else     if (absZ > 0.0001 && absZ > absX && absZ > absY) {
          orientation+=orientationZ;
          absZ=0;
        }
     else     break;
      }
      return orientation;
    }

    String method2(double x,double y,double z){
      StringBuffer buffer=new StringBuffer();
      String orientationX=x < 0 ? "R" : "L";
      String orientationY=y < 0 ? "A" : "P";
      String orientationZ=z < 0 ? "F" : "H";
      double absX=Math.abs(x);
      double absY=Math.abs(y);
      double absZ=Math.abs(z);
      for (int i=0; i < 3; ++i) {
        if (absX > .0001 && absX > absY && absX > absZ) {
          buffer.append(orientationX);
          absX=0;
        }
     else     if (absY > .0001 && absY > absX && absY > absZ) {
          buffer.append(orientationY);
          absY=0;
        }
     else     if (absZ > .0001 && absZ > absX && absZ > absY) {
          buffer.append(orientationZ);
          absZ=0;
        }
     else     break;
      }
      return buffer.toString();
    }
}
