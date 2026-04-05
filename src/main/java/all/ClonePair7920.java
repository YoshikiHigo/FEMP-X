package all;

import java.util.*;

public class ClonePair7920 {

    boolean method1(String value,int minValue,int maxValue,boolean includeMinimum,boolean includeMaximum,String name,ArrayList errList){
      int val=Integer.parseInt(value);
      boolean isOK=true;
      if (includeMinimum) {
        isOK=minValue <= val;
      }
     else {
        isOK=minValue < val;
      }
      if (isOK) {
        if (includeMaximum) {
          isOK=maxValue >= val;
        }
     else {
          isOK=maxValue > val;
        }
        if (isOK)     return true;
      }
      String errMsg=name + " is out of the interval ";
      if (includeMinimum) {
        errMsg+="[";
      }
     else {
        errMsg+="]";
      }
      errMsg+=minValue + ";" + maxValue;
      if (includeMaximum) {
        errMsg+="]";
      }
     else {
        errMsg+="[";
      }
      errList.add(errMsg);
      return false;
    }

    boolean method2(String value,int minValue,int maxValue,boolean includeMinVal,boolean includeMaxVal,String name,ArrayList errList){
      double val=Integer.parseInt(value);
      boolean isOK=true;
      if (includeMinVal) {
        isOK&=val >= minValue;
      }
     else {
        isOK&=val > minValue;
      }
      if (isOK) {
        if (includeMaxVal) {
          isOK&=val <= maxValue;
        }
     else {
          isOK&=val < maxValue;
        }
      }
      if (isOK) {
        return true;
      }
     else {
        String errMsg=name + " is out the interval ";
        errMsg+=includeMinVal ? "[" : "]";
        errMsg+=minValue + ";" + maxValue;
        errMsg+=includeMaxVal ? "]" : "[";
        errList.add(errMsg);
        return false;
      }
    }
}
