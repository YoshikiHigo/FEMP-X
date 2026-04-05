package unverified;

public class ClonePair12825 {

    String method1(String[] items,int index){
      if (items.length <= index) {
        return null;
      }
      return items[index];
    }

    String method2(String[] items,int index){
      if (items.length > index) {
        return items[index];
      }
     else {
        return null;
      }
    }
}
