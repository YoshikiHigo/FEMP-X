package unverified;

public class ClonePair12933 {

    String method1(String command){
      if ((command != null) && (command.length() > 0)) {
        if (command.charAt(0) == '/') {
          return command.substring(1);
        }
      }
      return command;
    }

    String method2(String path){
      if (path != null && path.length() > 0 && path.charAt(0) == '/') {
        return path.substring(1);
      }
      return path;
    }
}
