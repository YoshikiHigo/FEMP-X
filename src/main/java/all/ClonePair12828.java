package all;

public class ClonePair12828 {

    String method1(String[] items,int index){
      if (items.length > index) {
        return items[index];
      }
     else {
        return null;
      }
    }

    String method2(String[] split,int index){
      if (split.length <= index)   return null;
     else   return split[index].trim();
    }
}
