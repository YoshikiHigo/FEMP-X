package metadata;

public enum DifferenceType {
    RETURN_VALUE("return_value"),
    SIDE_EFFECT("side_effect"),
    EXCEPTION("exception"),
    NO_TERMINATION("no_termination");

    private final String id;

    DifferenceType(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
