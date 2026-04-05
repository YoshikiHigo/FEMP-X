package all;

public class ClonePair3 {

    String method1(String[] args,String arg,String def){
      for (int i=0; i < args.length; i++)   if (args[i].equals(arg))   return args[i + 1];
      return def;
    }

    String method2(String[] args,String name,String defaultValue){
      for (int i=0; i < args.length; i++) {
        if (args[i].equals(name)) {
          return args[i + 1];
        }
      }
      return defaultValue;
    }
}
