package all;

public class ClonePair4601 {

    boolean method1(Object thisObject,Object[] args,boolean value){
      if (args.length < 2) {
        return false;
      }
      return value ? (args[0] == args[1]) : (args[0] != args[1]);
    }

    boolean method2(Object thisObject,Object[] args,boolean value){
      if (args.length < 2)   return false;
      return value ? (args[0] == args[1]) : (args[0] != args[1]);
    }
}
