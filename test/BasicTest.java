import models.Post;
import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
 
    
    
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }
@Test
public void createAndRetriveUser(){
User usuario = new User("Oscar","cano","Oscar Cano", Boolean.FALSE,"Chihuahua" );
usuario.save();

User usuarioTest = User.find("byEmail", "Oscar").first();

assertNotNull(usuarioTest);
    assertEquals("Oscar Cano", usuarioTest.fullName);

    Post post = new Post("Creando el primer Post", usuario, "Este es el contenido del ultimo post que se agrego.");
    post.save();



    
}

}
