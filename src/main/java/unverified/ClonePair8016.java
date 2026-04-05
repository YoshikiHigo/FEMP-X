package unverified;

import java.util.*;

public class ClonePair8016 {

    double[] method1(String s,char delimChar){
      ArrayList<Double> valueList=new ArrayList<Double>();
      int count=0;
      try {
        int start=0;
        int delim=0;
        int l=s.length();
        while (start < l) {
          if (delim >= l || s.charAt(delim) == delimChar) {
            valueList.add(new Double(Double.parseDouble(s.substring(start,delim))));
            ++count;
            ++delim;
            start=delim;
            if (delim >= l) {
              break;
            }
          }
     else {
            ++delim;
          }
        }
      }
     catch (  NumberFormatException e) {
        e.printStackTrace(System.err);
        count=0;
      }
      double[] values=null;
      if (count > 0) {
        values=new double[count];
        for (int i=0; i < count; ++i) {
          values[i]=(valueList.get(i)).doubleValue();
        }
      }
      return values;
    }

    double[] method2(String s,char delimChar){
      ArrayList valueList=new ArrayList();
      int count=0;
      try {
        int start=0;
        int delim=0;
        int l=s.length();
        while (start < l) {
          if (delim >= l || s.charAt(delim) == delimChar) {
            valueList.add(new Double(Double.parseDouble(s.substring(start,delim))));
            ++count;
            ++delim;
            start=delim;
            if (delim >= l)         break;
          }
     else {
            ++delim;
          }
        }
      }
     catch (  NumberFormatException e) {
        e.printStackTrace(System.err);
        count=0;
      }
      double[] values=null;
      if (count > 0) {
        values=new double[count];
        for (int i=0; i < count; ++i) {
          values[i]=((Double)valueList.get(i)).doubleValue();
        }
      }
      return values;
    }
}
