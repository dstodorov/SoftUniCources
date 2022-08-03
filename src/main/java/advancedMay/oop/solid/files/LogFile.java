package advancedMay.oop.solid.files;

public class LogFile implements File {
    private final StringBuilder output;

    public LogFile() {
        this.output = new StringBuilder();
    }


    @Override
    public void write(String line) {
        output.append(line).append(System.lineSeparator());
    }

    @Override
    public int getSize() {
        return output.chars().filter(Character::isAlphabetic).sum();
    }
}
