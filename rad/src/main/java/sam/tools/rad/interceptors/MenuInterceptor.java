/**
 * Menu highlighted interceptor
 */
package sam.tools.rad.interceptors;

import java.util.Map;

import org.apache.log4j.Logger;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import sam.tools.rad.interfaces.SaveMenu;

public class MenuInterceptor implements Interceptor{
	private static final long serialVersionUID = 3834951977485554052L;
	public static Logger logger = Logger.getLogger(MenuInterceptor.class);
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object obj = invocation.getAction();
		String actionName = invocation.getProxy().getActionName();
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		
		if(obj instanceof SaveMenu){
			session.put("menuItem", actionName);
		}
		
		return invocation.invoke();
	}

}
