package tasks.configs;

// ! Mai am punctul 6.4 de implementat

public final class Configuration {      // so that child classes can't be created
    // (ALT + INSERT) click dreapta pe o variabila - Generate => gettere si settere automate
    final String dbConnectionString;    // so that we can't change the value of this field after object creation
    final String externalResourcesPath;
    final String environment;

    public Configuration(String dbCon, String extResPath, String environment) { //parametrized constructor
        dbConnectionString = dbCon;
        externalResourcesPath = extResPath;
        this.environment = environment;
    }

    // Getter method for all the variables in it
    public String getDbConnectionString() {
        return dbConnectionString;
    }

    public String getExternalResourcesPath() {
        return externalResourcesPath;
    }

    public String getEnvironment() {
        return environment;
    }

    // No setters

    public static void main(String[] args) {

    }

}
