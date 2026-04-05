package unverified;

public class ClonePair4462 {

    double method1(double firstAngle,double secondAngle){
      double difference=secondAngle - firstAngle;
      while (difference < -180) {
        difference+=360;
      }
      while (difference > 180) {
        difference-=360;
      }
      return difference;
    }

    double method2(double value1,double value2){
      double delta=(value2 - value1) % 360.0;
      if (delta < -180.0)   delta+=360.0;
     else   if (delta > 180.0)   delta-=360.0;
      return delta;
    }
}
