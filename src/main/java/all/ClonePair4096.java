package all;

public class ClonePair4096 {

    double method1(double angle1,double angle2){
      double delta=(angle2 - angle1) % 360;
      if (delta < -180)   return 360 + delta;
      if (delta > 180)   return delta - 360;
      return delta % 360;
    }

    double method2(double firstAngle,double secondAngle){
      double difference=secondAngle - firstAngle;
      while (difference < -180) {
        difference+=360;
      }
      while (difference > 180) {
        difference-=360;
      }
      return difference;
    }
}
