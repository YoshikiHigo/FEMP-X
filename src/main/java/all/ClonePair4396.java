package all;

public class ClonePair4396 {

    String method1(String[] args,String name){
      for (int i=0; i < args.length; i++) {
        if (args[i].equals(name) && (i + 1) < args.length) {
          return args[i + 1];
        }
      }
      return null;
    }

    String method2(String[] args,String arg){
      for (int i=0; i < args.length; i++) {
        if (args[i].equals(arg) && i < args.length - 1) {
          return args[i + 1];
        }
      }
      return null;
    }
}
