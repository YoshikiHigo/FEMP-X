package inequivalent;

public class ClonePair12863 {

    String method1(String command) {
        if ((command != null) && (command.length() > 0)) {
            if (command.charAt(0) == '/') {
                return command.substring(1);
            }
        }
        return command;
    }

    String method2(String path) {
        if (path == null || path.trim().length() == 0) return path;
        path = path.trim();
        String newPath = null;
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c != '/' && c != '\\') {
                if (i != 0) {
                    path = newPath;
                }
                break;
            } else {
                if (i < path.length() - 1) {
                    newPath = path.substring(i + 1);
                }
            }
        }
        return path;
    }
}
