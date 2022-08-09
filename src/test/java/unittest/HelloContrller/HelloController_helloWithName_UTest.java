package unittest.HelloContrller;

import com.DockerChallenges.controller.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HelloController_helloWithName_UTest {

    @InjectMocks
    HelloController helloController;

    @BeforeEach
    public void beforeAll(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void mustSayHelloToSpecialName(){
        Assertions.assertEquals(new ResponseEntity<>("Hello mostafaKarimi", HttpStatus.OK),helloController.helloWithName("MostaFa  kaRimi"));
    }
}
