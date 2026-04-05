package all;

public class ClonePair7421 {

    boolean method1(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      if (o1 instanceof Integer && o2 instanceof Integer)   return ((Integer)o1).equals((Integer)o2);
     else   return o1.equals(o2);
    }

    boolean method2(Object value,Object target){
      if ((value == null) && (target == null)) {
        return true;
      }
     else   if ((value == null) || (target == null)) {
        return false;
      }
     else   if (value.equals(target)) {
        return true;
      }
     else {
        return value.toString().equals(target.toString());
      }
    }
}
