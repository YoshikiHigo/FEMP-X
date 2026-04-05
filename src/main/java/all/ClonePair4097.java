package all;

public class ClonePair4097 {

    double method1(double angle1,double angle2){
      double delta=(angle2 - angle1) % 360;
      if (delta < -180)   return 360 + delta;
      if (delta > 180)   return delta - 360;
      return delta % 360;
    }

    double method2(double value1,double value2){
      double delta=(value2 - value1) % 360.0;
      if (delta < -180.0)   delta+=360.0;
     else   if (delta > 180.0)   delta-=360.0;
      return delta;
    }
}
