package all;

public class ClonePair11289 {

    Number method1(Number left,Number right){
      if (left instanceof Double || right instanceof Double)   return left.doubleValue() + right.doubleValue();
      if (left instanceof Float || right instanceof Float)   return left.floatValue() + right.floatValue();
      if (left instanceof Long || right instanceof Long)   return left.longValue() + right.longValue();
      return left.intValue() + right.intValue();
    }

    Number method2(Number arg1,Number arg2){
      if (arg1 instanceof Double || arg2 instanceof Double)   return arg1.doubleValue() + arg2.doubleValue();
     else   if (arg1 instanceof Float || arg2 instanceof Float)   return arg1.floatValue() + arg2.floatValue();
     else   if (arg1 instanceof Long || arg2 instanceof Long)   return arg1.longValue() + arg2.longValue();
     else   return arg1.intValue() + arg2.intValue();
    }
}
