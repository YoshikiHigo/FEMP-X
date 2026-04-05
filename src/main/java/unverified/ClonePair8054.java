package unverified;

public class ClonePair8054 {

    int method1(String[] supported,String expertise){
      if (supported == null)   return -1;
      if (expertise == null)   return -1;
      for (int i=0; i < supported.length; i++)   if (supported[i].equals(expertise))   return i;
      return -1;
    }

    int method2(String[] array,String key){
      int i, pos=-1;
      if ((array == null) || (key == null))   return -1;
      for (i=0; i < array.length; i++) {
        if (array[i].equals(key)) {
          pos=i;
          break;
        }
      }
      return pos;
    }
}
