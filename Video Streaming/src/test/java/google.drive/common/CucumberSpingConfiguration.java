package google.drive.common;


import google.drive.VideoStreamingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoStreamingApplication.class })
public class CucumberSpingConfiguration {
    
}
