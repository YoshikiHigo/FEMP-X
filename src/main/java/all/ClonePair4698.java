package all;

public class ClonePair4698 {

    double method1(double[] xy){
      final int n=xy.length;
      double area=0.0;
      for (int i=0; i < n - 2; i+=2)   area+=(xy[i] * xy[i + 3]) - (xy[i + 2] * xy[i + 1]);
      area+=(xy[xy.length - 2] * xy[1]) - (xy[0] * xy[xy.length - 1]);
      area*=0.5;
      return area;
    }

    double method2(double[] xy){
      final int n=xy.length;
      double area=0.0;
      for (int i=0; i < n - 2; i+=2) {
        area+=(xy[i] * xy[i + 3]) - (xy[i + 2] * xy[i + 1]);
      }
      area+=(xy[xy.length - 2] * xy[1]) - (xy[0] * xy[xy.length - 1]);
      area*=0.5;
      return area;
    }
}
