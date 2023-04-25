package content;

import org.springframework.stereotype.Service;


public interface CommentService {
	
	public void saveOrUpdateComment(CommentTO comment);

}
