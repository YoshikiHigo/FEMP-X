package all;

public class ClonePair12820 {

    String method1(String[] args,int argIndex){
      int lastIndex=args.length - 1;
      if (argIndex > lastIndex) {
        return null;
      }
     else {
        return args[argIndex];
      }
    }

    String method2(String[] items,int index){
      if (items.length <= index) {
        return null;
      }
      return items[index];
    }
}
