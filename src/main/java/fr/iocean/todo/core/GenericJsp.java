package fr.iocean.todo.core;

import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.runtime.HttpJspBase;
import org.springframework.web.context.support.WebApplicationContextUtils;

public abstract class GenericJsp extends HttpJspBase{
	@SuppressWarnings("rawtypes")
	public Object getBean(HttpServletRequest request, String name) {
		return WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext()).getBean(name);
	}
	
}
