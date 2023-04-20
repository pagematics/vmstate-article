package content;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

    public boolean hasBadContent(MultipartFile file) throws IOException {
        // Check whether the file contains bad content here
        return false;
    }

}

