package unverified;

import java.util.*;

public class ClonePair7472 {

    boolean method1(Object objectA,Object objectB){
      if (objectA == objectB) {
        return true;
      }
      if (objectA == null && objectB == null) {
        return true;
      }
      if (objectA == null || objectB == null) {
        return false;
      }
      if (objectA instanceof Number && objectB instanceof Number) {
        Number numberA=(Number)objectA;
        Number numberB=(Number)objectB;
        final long aLong=numberA.longValue();
        final double aDouble=numberA.doubleValue();
        final long bLong=numberB.longValue();
        final double bDouble=numberB.doubleValue();
        if (aLong == aDouble && bLong == bDouble) {
          return aLong == bLong;
        }
     else {
          return aDouble == bDouble;
        }
      }
      if (objectA.getClass().isArray() && objectB.getClass().isArray()) {
        final Class aCompType=objectA.getClass().getComponentType();
        final Class bCompType=objectB.getClass().getComponentType();
        if (!aCompType.equals(bCompType)) {
          return false;
        }
        if (String.class.equals(aCompType)) {
          return Arrays.equals((String[])objectA,(String[])objectB);
        }
        if (Byte.TYPE.equals(aCompType)) {
          return Arrays.equals((byte[])objectA,(byte[])objectB);
        }
        if (Short.TYPE.equals(aCompType)) {
          return Arrays.equals((short[])objectA,(short[])objectB);
        }
        if (Integer.TYPE.equals(aCompType)) {
          return Arrays.equals((int[])objectA,(int[])objectB);
        }
        if (Long.TYPE.equals(aCompType)) {
          return Arrays.equals((long[])objectA,(long[])objectB);
        }
        if (Character.TYPE.equals(aCompType)) {
          return Arrays.equals((char[])objectA,(char[])objectB);
        }
        if (Float.TYPE.equals(aCompType)) {
          return Arrays.equals((float[])objectA,(float[])objectB);
        }
        if (Double.TYPE.equals(aCompType)) {
          return Arrays.equals((double[])objectA,(double[])objectB);
        }
        if (Boolean.TYPE.equals(aCompType)) {
          return Arrays.equals((boolean[])objectA,(boolean[])objectB);
        }
        return Arrays.equals((Object[])objectA,(Object[])objectB);
      }
      return objectA.equals(objectB);
    }

    boolean method2(Object o1,Object o2){
      if (o1 == null) {
        if (o2 != null) {
          return false;
        }
      }
     else   if (o2 == null) {
        return false;
      }
     else   if (!o1.equals(o2)) {
        return false;
      }
      return true;
    }
}
