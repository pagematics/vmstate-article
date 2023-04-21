package content;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Evaluate;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.FoundFaces;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.OCR;

public class EvaluationData 
{
        // The URL of the evaluated image.
        public String ImageUrl;
        // The image moderation results.
        public Evaluate ImageModeration;
        // The text detection results.
        public OCR TextDetection;
        // The face detection results;
        public FoundFaces FaceDetection;
    }
