package unverified;

public class ClonePair7536 {

    boolean method1(Object a,Object b){
      if (a == b)   return true;
     else   if ((a == null) || (b == null))   return false;
     else   return a.getClass() == b.getClass();
    }

    boolean method2(Object left,Object right){
      if (left == right)   return true;
      if (left == null || right == null)   return false;
      return left.getClass() == right.getClass();
    }
}
