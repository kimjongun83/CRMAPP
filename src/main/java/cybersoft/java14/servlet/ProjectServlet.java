package cybersoft.java14.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java14.utils.JspConst;
import cybersoft.java14.utils.UrlConst;

@WebServlet(name = "projectServlet", urlPatterns = { UrlConst.MANAGE_PROJECT, UrlConst.CREATE_PROJECT })
public class ProjectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		switch (path) {
		case UrlConst.MANAGE_PROJECT:
			req.getRequestDispatcher(JspConst.MANAGE_PROJECT).forward(req, resp);
			break;
		case UrlConst.CREATE_PROJECT:
			req.getRequestDispatcher(JspConst.CREATE_PROJECT).forward(req, resp);
			break;
		default:
			break;
		}
	}
}
