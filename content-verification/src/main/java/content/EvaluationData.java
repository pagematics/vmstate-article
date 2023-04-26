package content;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Evaluate;

public class EvaluationData 
{
        // The URL of the evaluated image.
        public String ImageUrl;
        // The image moderation results.
        public Evaluate ImageModeration;
    }

