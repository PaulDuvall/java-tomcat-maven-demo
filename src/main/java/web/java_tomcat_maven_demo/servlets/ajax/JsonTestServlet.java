package web.java_tomcat_maven_demo.servlets.ajax;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.java_tomcat_maven_demo.nosql.MapDataCache;

import com.google.gson.Gson;

public class JsonTestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Object name = req.getParameter("name");
		Object time = req.getParameter("time");
		
		MapDataCache.putDataStampKey("testMap", "message", "This Sucks");
		
	    Map<String, String> options = new LinkedHashMap<String, String>();
	    options.put("value1", "label1");
	    options.put("value2", "label2");
	    options.put("value3", "label3");
	    String json = new Gson().toJson(options);

	    resp.setContentType("application/json");
	    resp.setCharacterEncoding("UTF-8");
	    resp.getWriter().write(json);	    
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
