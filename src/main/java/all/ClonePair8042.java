package all;

public class ClonePair8042 {

    int method1(String[] lista,String target){
      if (lista == null || lista.length == 0)   return -1;
      for (int i=0; i < lista.length; i++) {
        if (lista[i].equals(target))     return i;
      }
      return -1;
    }

    int method2(String[] elements,String element){
      if (elements != null) {
        for (int i=0; i < elements.length; i++) {
          if (elements[i].equals(element)) {
            return i;
          }
        }
      }
      return -1;
    }
}
