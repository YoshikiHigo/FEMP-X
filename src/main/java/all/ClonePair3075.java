package all;

public class ClonePair3075 {

    double method1(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Double.parseDouble(srcValue);
    }

    double method2(String string){
      if (string == null)   return 0.0;
     else   if (string.trim().equals(""))   return 0.0;
     else   return Double.valueOf(string);
    }
}
