package Week7.Lab;

public interface Logger {
    void logMessage(messageProviderLogger provider);
}

record RecordLogger (String name) implements Logger{
    @Override
    public void logMessage(messageProviderLogger provider) {
        System.out.println(name + " " + provider.provideMessage());
    }
}
class ClassLogger implements Logger{
    private String name;
    public ClassLogger(String name){
        this.name = name;
    }

    @Override
    public void logMessage(messageProviderLogger provider) {
        System.out.println(name + provider.provideMessage());
    }
}
class Main{
    public static void main(String[] args) {
        Logger recordLogger = new RecordLogger("RecordLogger");
        recordLogger.logMessage(() -> "Logging with lambda function in a record");
        Logger classLogger = new ClassLogger("ClassLogger");
        classLogger.logMessage(() -> "Logging with lambda function in a class");
    }
}