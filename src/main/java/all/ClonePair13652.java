package all;

public class ClonePair13652 {

    String method1(int pos,String[] args,String def){
      if (args.length > pos) {
        return args[pos];
      }
      return def;
    }

    String method2(int pos,String[] args,String defaultValue){
      if (args.length > pos) {
        return args[pos];
      }
     else {
        return defaultValue;
      }
    }
}
