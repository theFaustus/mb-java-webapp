package com.evil.inc.mb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InvoicesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (req.getRequestURI().equalsIgnoreCase("/")) {
            resp.setContentType("text/html; charset=UTF-8");
            resp.getWriter().print("<html>\n" +
                    "<body>\n" +
                    "<h1>This is my HTML page</h1>\n" +
                    "<p> hallo what is going on!!!</p>\n" +
                    "</body>\n" +
                    "</html>");
        } else if(req.getRequestURI().equalsIgnoreCase("/invoices")){
            resp.setContentType("application/json; charset=UTF-8");
            resp.getWriter().println("[]");
        }
    }
}
