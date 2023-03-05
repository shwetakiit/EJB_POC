package kumari.shweta.ejb.statelessbean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless(mappedName = "HelloBean")
@LocalBean
public class HelloBean implements HelloBeanRemote {

    /**
     * Default constructor. 
     */
    public HelloBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "welcome to EJB";
	}

}
