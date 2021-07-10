package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("123123123");
        assertAll("Properties test",
                () -> assertAll("Person properties",
                        () -> assertEquals("Joe", owner.getFirstName()),
                        () -> assertEquals("Buck", owner.getLastName()),

               () -> assertAll("OwnerProperties",
                       () -> assertEquals("Key West", owner.getCity()),
                       () -> assertEquals("123123123", owner.getTelephone()))));

        assertThat(owner.getCity(), is("Key West"));
    }

}