<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<%
    String rand = (String) session.getAttribute("rand");
    String input = request.getParameter("rand");
    if (rand.equalsIgnoreCase(input))
    {
        out.print("Auth Success!");
        out.print("<br><a href=\"index.jsp\">Back</a>");
    }
    else
    {
        out.print("Auth Failed!");
        out.print("<br><a href=\"index.jsp\">Back</a>");
    }
%>
