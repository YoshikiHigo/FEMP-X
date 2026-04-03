package equivalent;

import java.util.Map;

public class ClonePair4862 {
    String[] method1(String[] argv, Map aliases) {
        String[] result;
        String[] alias;
        boolean done;
        int i;
        if ((argv == null) || (argv.length == 0)) {
            return argv;
        }
        if ((aliases == null) || (aliases.size() == 0)) {
            return argv;
        }
        alias = (String[]) aliases.get(argv[0]);
        if (alias == null) {
            return argv;
        }
        result = new String[(alias.length + argv.length) - 1];
        System.arraycopy(alias, 0, result, 0, alias.length);
        System.arraycopy(argv, 1, result, alias.length, argv.length - 1);
        return result;
    }

    String[] method2(String[] argv, Map aliases) {
        String[] result;
        String[] alias;
        boolean done;
        int i;
        if (argv == null || argv.length == 0) {
            return argv;
        }
        if (aliases == null || aliases.size() == 0) {
            return argv;
        }
        alias = (String[]) aliases.get(argv[0]);
        if (alias == null) {
            return argv;
        }
        result = new String[alias.length + argv.length - 1];
        System.arraycopy(alias, 0, result, 0, alias.length);
        System.arraycopy(argv, 1, result, alias.length, argv.length - 1);
        return result;
    }
}
