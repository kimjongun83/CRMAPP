package cybersoft.java14.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java14.utils.JspConst;
import cybersoft.java14.utils.UrlConst;

@WebServlet(name = "userServlet", urlPatterns = {
		UrlConst.LIST_USER,
		UrlConst.CREATE_USER
})
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		switch (path) {
		case UrlConst.LIST_USER:
			req.getRequestDispatcher(JspConst.LIST_USER).forward(req, resp);
			break;
		case UrlConst.CREATE_USER:
			req.getRequestDispatcher(JspConst.CREATE_USER).forward(req, resp);
			break;
		default:
			break;
		}
	}
}
