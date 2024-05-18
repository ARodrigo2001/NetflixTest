package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.TestLogin;
import tests.TestLogout;
import tests.TestMovie;
import tests.TestMyList;
import tests.TestNavigation;
import tests.TestProfile;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestLogin.class,
    TestLogout.class,
    TestMovie.class,
    TestMyList.class,
    TestNavigation.class,
    TestProfile.class
   
})
public class TestSuiteNetflix {
}
