package kr.or.ddit.mvc.view;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

//구구단 custom view 
//spring customview 를 만들기 위해서는 View interface를 구현할 필요가 있음 
public class TimesTablesView implements View{

	@Override
	public String getContentType() {
		
		return null;
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		String str = request.getParameter("dan");
		int value;
		if(str != null) {
			value = Integer.parseInt(request.getParameter("dan"));
		}else {
			value = 9;
		}
		
		pw.println("<style type=\"text/css\">");
		pw.println("td{");
		pw.println("border : solid 1px black");
		pw.println("}");
		pw.println("</style>");
		pw.println("<!DOCTYPE html>");
		pw.println("	<html>");
		pw.println("		<head>");
		pw.println("			<meta charset=\"UTF-8\">");
		pw.println("			<title>Insert title here</title>");

		pw.println("		</head>");
		pw.println("		<body>");
		pw.println("<table>");
		
		for(int i = 1; i < 9; i++){
			pw.println("<tr>");
			for(int j = 2; j < value; j++){
				pw.println("<td>"+j+"*"+i+"="+i*j+"</td>");
			}
			pw.println("<tr>");
		}
		
		pw.println("</table>");
		pw.println("		</body>");
		pw.println("	</html>");
		pw.flush();
		pw.close();
	}
	
}
