package unverified;

public class ClonePair12826 {

    String method1(String[] items,int index){
      if (items.length <= index) {
        return null;
      }
      return items[index];
    }

    String method2(String[] split,int index){
      if (split.length <= index)   return null;
     else   return split[index].trim();
    }
}
