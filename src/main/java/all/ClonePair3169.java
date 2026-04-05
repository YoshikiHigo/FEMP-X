package all;

public class ClonePair3169 {

    long method1(Object object){
      if (object instanceof Integer) {
        return (Integer)object;
      }
     else {
        return (Long)object;
      }
    }

    long method2(Object field){
      long size=0;
      if (field instanceof Long)   size=(Long)field;
     else   size=(long)(int)(Integer)field;
      return size;
    }
}
