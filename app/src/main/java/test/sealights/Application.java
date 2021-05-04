package test.sealights;

public class Application {

    public static void main(String[] args) {
        Library lib = new Library();
        Application app = new Application();
        System.out.println(app.isLibraryMethod(lib));
    }

    public boolean isLibraryMethod(Library lib) {
        return lib.someLibraryMethod();
    }
}
