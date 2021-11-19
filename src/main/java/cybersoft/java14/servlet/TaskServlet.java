package cybersoft.java14.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java14.utils.JspConst;
import cybersoft.java14.utils.UrlConst;

@WebServlet(name = "taskServlet", urlPatterns = {
		UrlConst.TASK
})
public class TaskServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(JspConst.TASK).forward(req, resp);
	}
}
