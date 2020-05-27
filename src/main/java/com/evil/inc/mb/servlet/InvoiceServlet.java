package com.evil.inc.mb.servlet;

import com.evil.inc.mb.model.Invoice;
import com.evil.inc.mb.repository.impl.InMemInvoiceRepositoryImpl;
import com.evil.inc.mb.service.InvoiceService;
import com.evil.inc.mb.service.impl.InvoiceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.evil.inc.mb.config.Application.invoiceService;
import static com.evil.inc.mb.config.Application.objectMapper;

public class InvoiceServlet extends HttpServlet {

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
            List<Invoice> invoices = invoiceService.findAll();  //
            resp.getWriter().print(objectMapper.writeValueAsString(invoices));  //
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getRequestURI().equalsIgnoreCase("/invoices")){
            String userId = req.getParameter("userId");
            Integer amount = Integer.valueOf(req.getParameter("amount"));

            Invoice invoice = invoiceService.create(userId, amount);

            resp.setContentType("application/json; charset=UTF-8");
            String json = objectMapper.writeValueAsString(invoice);
            resp.getWriter().print(json);
        }
        else {
            throw new IllegalStateException("no url  mapped");
        }
    }
}
