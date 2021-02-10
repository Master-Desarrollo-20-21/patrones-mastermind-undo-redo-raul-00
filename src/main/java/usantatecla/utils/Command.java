package usantatecla.utils;

public abstract class Command {
    private String title;

    protected Command(String title) {
        this.title = title;
    }

    protected abstract void execute();

    protected abstract boolean isActive();

    public String getTitle() {
        return title;
    }
}
