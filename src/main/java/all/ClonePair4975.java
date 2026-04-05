package all;

import java.util.*;

public class ClonePair4975 {

    List method1(String min,String max,String inc){
      long minLong=Long.parseLong(min);
      long maxLong=Long.parseLong(max);
      long incLong=Long.parseLong(inc);
      if (minLong > maxLong) {
        long temp=minLong;
        minLong=maxLong;
        maxLong=temp;
      }
      int capacity=(int)((maxLong - minLong) / incLong + 1);
      List longValues=new ArrayList(capacity);
      for (long val=minLong; val <= maxLong; val+=incLong)   longValues.add(Long.toString(val));
      return longValues;
    }

    List method2(String min,String max,String inc){
      int minInteger=Integer.parseInt(min);
      int maxInteger=Integer.parseInt(max);
      int incInteger=Integer.parseInt(inc);
      if (minInteger > maxInteger) {
        int temp=minInteger;
        minInteger=maxInteger;
        maxInteger=temp;
      }
      int capacity=(maxInteger - minInteger) / incInteger + 1;
      List intValues=new ArrayList(capacity);
      for (int val=minInteger; val <= maxInteger; val+=incInteger)   intValues.add(Integer.toString(val));
      return intValues;
    }
}
