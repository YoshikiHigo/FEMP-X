package inequivalent;

import java.util.Vector;

public class ClonePair9303 {

    String method1(Vector commands, int startAt, int endAt) {
        StringBuffer Combined = new StringBuffer();
        if (commands != null) for (int commandIndex = startAt; commandIndex < endAt; commandIndex++)
            Combined.append(commands.elementAt(commandIndex).toString() + " ");
        return Combined.toString().trim();
    }

    String method2(Vector commands, int startAt, int endAt) {
        StringBuffer Combined = new StringBuffer();
        if (commands != null) for (int commandIndex = startAt; commandIndex < endAt; commandIndex++) {
            String s = commands.elementAt(commandIndex).toString();
            if (s.indexOf(" ") >= 0) s = "\"" + s + "\"";
            Combined.append(s + " ");
        }
        return Combined.toString().trim();
    }
}
