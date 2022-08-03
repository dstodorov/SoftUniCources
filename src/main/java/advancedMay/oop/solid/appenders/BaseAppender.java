package advancedMay.oop.solid.appenders;

import advancedMay.oop.solid.layouts.Layout;

public abstract class BaseAppender implements Appender{

    protected int numberOfMessages = 0;
    private final Layout layout;

    public BaseAppender(Layout layout) {
        this.layout = layout;
    }

    @Override
    public Layout getLayout() {
        return layout;
    }

    @Override
    public int getMessagesCount() {
        return numberOfMessages;
    }

}
