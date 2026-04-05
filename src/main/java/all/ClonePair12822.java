package all;

public class ClonePair12822 {

    String method1(String[] args,int argIndex){
      int lastIndex=args.length - 1;
      if (argIndex > lastIndex) {
        return null;
      }
     else {
        return args[argIndex];
      }
    }

    String method2(String[] split,int index){
      if (split.length <= index)   return null;
     else   return split[index].trim();
    }
}
