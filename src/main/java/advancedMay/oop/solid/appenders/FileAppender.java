package advancedMay.oop.solid.appenders;

import advancedMay.oop.solid.MessageLogger;
import advancedMay.oop.solid.files.File;
import advancedMay.oop.solid.layouts.Layout;

public class FileAppender extends BaseAppender{
    private final Layout layout;
    private final File file;

    public FileAppender(Layout layout, File file) {
        super(layout);
        this.layout = layout;
        this.file = file;
    }

    @Override
    public void append(String timestamp, MessageLogger.ReportLevel reportLevel, String message) {
        numberOfMessages++;
        file.write(layout.format(timestamp, reportLevel, message));
    }

    public File getFile() {
        return file;
    }
}
