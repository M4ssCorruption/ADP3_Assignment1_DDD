/* UserFactoryTest.java
 Test for the UserFactoryTest
 Author: Daniel Marais (219476845)
 Date: 30 March 2022

 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.User;

import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {

        @Test
        public void test(){
            User user= UserFactory.createUser("Daniel","Marais","219476845@mycput.ac.za",2,1);
            System.out.println(user.toString());
            assertNotNull(user);
        }
}