package web.webap.servlets.ajax;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.webap.nosql.MapDataCache;

import com.google.gson.Gson;

public class JsonMapDBMessageServlet extends HttpServlet { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		NavigableSet<Object> keySet = MapDataCache.getKeySet("testMap");	
	    Map<String, String> options = new LinkedHashMap<String, String>();
	    
	    for(Object string : keySet) {
	    	options.put(string.toString(), string.toString());
	    	
	    }
	    
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
