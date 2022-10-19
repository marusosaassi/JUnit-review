import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {
    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest() {
        //execute method and perform assers
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){
        //
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        //
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        //
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly() {
        //
    }
}
