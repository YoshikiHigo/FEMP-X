package unverified;

public class ClonePair8043 {

    int method1(String[] lista,String target){
      if (lista == null || lista.length == 0)   return -1;
      for (int i=0; i < lista.length; i++) {
        if (lista[i].equals(target))     return i;
      }
      return -1;
    }

    int method2(String[] supported,String expertise){
      if (supported == null)   return -1;
      if (expertise == null)   return -1;
      for (int i=0; i < supported.length; i++)   if (supported[i].equals(expertise))   return i;
      return -1;
    }
}
