<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.servlet.support.RequestContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.Enumeration"%>
<%@page import="fr.iocean.todo.model.Usr"%>
<%@page import="fr.iocean.todo.service.UsrService"%>
<%@page extends="fr.iocean.todo.core.GenericJsp" %>
<html>
<body>
<h2>Hello World!</h2>
<% 	UsrService service = (UsrService)getBean(request,"usrService");
	Usr usr = null;
	String id = request.getParameter("id");	
	if(id!=null)usr = service.findUsrById(Integer.parseInt(id));
	if(usr!=null){
%>

<ul>
	<li>id: <%=usr.getId() %></li>
	<li>login: <%=usr.getLogin() %></li>
</ul>

<% } else out.print("Aucun utilisateur trouvé"); %>  
</body>
</html>
