package content;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HibernateDao
{
	@Autowired
	@Qualifier(value = "sessionFactory")
	private SessionFactory	sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory)
		{
			this.sessionFactory = sessionFactory;
		}

	protected Session getCurrentSession()
		{
			return this.sessionFactory.getCurrentSession();
		}
}
