package all;

public class ClonePair7336 {

    boolean method1(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() == value2.getClass())   return value1.equals(value2);
     else   return false;
    }

    boolean method2(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      if (o1 instanceof Integer && o2 instanceof Integer)   return ((Integer)o1).equals((Integer)o2);
     else   return o1.equals(o2);
    }
}
