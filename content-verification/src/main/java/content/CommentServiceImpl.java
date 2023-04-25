package content;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("commentService")
public class CommentServiceImpl implements CommentService
{
	@Autowired
	CommentDao commentDao;

	@Transactional
	@Override
	public void saveOrUpdateComment(CommentTO comment) {
		commentDao.saveOrUpdateComment(comment);
	}

}
