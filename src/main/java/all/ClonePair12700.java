package all;

public class ClonePair12700 {

    int[] method1(int corners,int radius){
      double angle=2 * Math.PI / corners;
      int[] polygon=new int[2 * corners];
      if (corners % 2 == 0) {
        for (int i=0; i < polygon.length; i+=2) {
          polygon[i]=(int)(Math.cos(i / 2 * angle) * radius);
          polygon[i + 1]=(int)(Math.sin(i / 2 * angle) * radius);
        }
      }
     else {
        for (int i=0; i < polygon.length; i+=2) {
          polygon[i]=(int)(Math.sin(i / 2 * angle) * radius);
          polygon[i + 1]=(int)(Math.cos(i / 2 * angle) * radius * (-1));
        }
      }
      return polygon;
    }

    int[] method2(int corners,int radius){
      double angle=2 * Math.PI / corners;
      int[] polygon=new int[2 * corners];
      if (corners % 2 == 0) {
        for (int i=0; i < polygon.length; i+=2) {
          int index=(2 * i) % polygon.length;
          polygon[i]=(int)(Math.cos(index / 2 * angle) * radius);
          polygon[i + 1]=(int)(Math.sin(index / 2 * angle) * radius);
        }
      }
     else {
        for (int i=0; i < polygon.length; i+=2) {
          int index=(2 * i) % polygon.length;
          polygon[i]=(int)(Math.sin(index / 2 * angle) * radius);
          polygon[i + 1]=(int)(Math.cos(index / 2 * angle) * radius * (-1));
        }
      }
      return polygon;
    }
}
