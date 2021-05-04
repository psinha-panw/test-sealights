package test.sealights;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    Application app = new Application();
    Library lib = new Library();

    @org.junit.jupiter.api.Test
    void main() {
        //Not covered
    }

    @org.junit.jupiter.api.Test
    void isLibraryMethod() {
        boolean result = app.isLibraryMethod(lib);
        assertTrue(result);
    }
}