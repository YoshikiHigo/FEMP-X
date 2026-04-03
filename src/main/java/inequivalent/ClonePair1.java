package inequivalent;

public class ClonePair1 {

    String method1(Throwable e) {
        Throwable throwable;
        while ((throwable = e.getCause()) != null) {
            e = throwable;
        }
        return e.getMessage();
    }

    String method2(Throwable t) {
        Throwable cause = t;
        Throwable subCause = cause.getCause();
        while (subCause != null && !subCause.equals(cause)) {
            cause = subCause;
            subCause = cause.getCause();
        }
        return cause.getMessage();
    }
}
