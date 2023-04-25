package content;

import org.springframework.stereotype.Repository;

@Repository("commentDao")
public class CommentDaoImpl extends HibernateDao implements CommentDao
{

	@Override
	public void saveOrUpdateComment(CommentTO comment) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(comment);
	}

}
