package unverified;

import java.util.*;

public class ClonePair8776 {

    double method1(ArrayList<Double> arr){
      double total=0;
      double size=(double)arr.size();
      double mean;
      for (int i=0; i < arr.size(); i++) {
        total+=arr.get(i);
      }
      mean=total / size;
      return (mean);
    }

    double method2(ArrayList<Double> values){
      double sum=0;
      for (int i=0; i < values.size(); i++) {
        sum=sum + (values.get(i)).doubleValue();
      }
      return sum / values.size();
    }
}
