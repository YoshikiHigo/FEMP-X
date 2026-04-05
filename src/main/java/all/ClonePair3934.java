package all;

public class ClonePair3934 {

    double method1(String[] raw,int count){
      double min=Double.parseDouble(raw[0]);
      int i=0;
      for (; i < count; i++)   if (Double.parseDouble(raw[i]) < min)   min=Double.parseDouble(raw[i]);
      return min;
    }

    double method2(String[] raw,int count){
      double max=Double.parseDouble(raw[0]);
      int i=0;
      for (; i < count; i++)   if (Double.parseDouble(raw[i]) > max)   max=Double.parseDouble(raw[i]);
      return max;
    }
}
