package content;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FileController {

    @PostMapping("/check-file")
    public String checkFile(@RequestParam("file") MultipartFile file) throws IOException {
    	
    	final String subscriptionKey = "bd65975c089746a6a7d446f8a7130d76";
    	final String endpoint = "https://pagematics.cognitiveservices.azure.com/";
    	ContentModeratorClient client = ContentModeratorManager.authenticate(AzureRegionBaseUrl.fromString(endpoint),
    	        "CONTENT_MODERATOR_SUBSCRIPTION_KEY");
        return "File does not contain bad content";
    }
}



