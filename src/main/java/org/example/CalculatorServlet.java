package org.example;

import org.example.calculator.domain.Calculator;
import org.example.calculator.domain.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);
    private ServletConfig servletConfig;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("service");
        int operand1 = Integer.parseInt(req.getParameter("operand1"));
        String operator = req.getParameter("operator");
        int operand2 = Integer.parseInt(req.getParameter("operand2"));

        int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        PrintWriter writer = resp.getWriter();
        writer.println(result);
    }
}

//package org.example;
//
//import org.example.calculator.domain.Calculator;
//import org.example.calculator.domain.PositiveNumber;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/calculate")
//public class CalculatorServlet extends GenericServlet {
//    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);
//    private ServletConfig servletConfig;
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        log.info("service");
//        int operand1 = Integer.parseInt(req.getParameter("operand1"));
//        String operator = req.getParameter("operator");
//        int operand2 = Integer.parseInt(req.getParameter("operand2"));
//
//        int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));
//
//        PrintWriter writer = res.getWriter();
//        writer.println(result);
//    }
//}


//package org.example;
//
//import org.example.calculator.domain.Calculator;
//import org.example.calculator.domain.PositiveNumber;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/calculate")
//public class CalculatorServlet implements Servlet {
//    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);
//    private ServletConfig servletConfig;
//    @Override
//    public void init(ServletConfig servletConfig) throws ServletException {
//        log.info("init");
//        this.servletConfig = servletConfig;
//    }
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        log.info("service");
//        int operand1 = Integer.parseInt(req.getParameter("operand1"));
//        String operator = req.getParameter("operator");
//        int operand2 = Integer.parseInt(req.getParameter("operand2"));
//
//        int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));
//
//        PrintWriter writer = res.getWriter();
//        writer.println(result);
//    }
//
//    @Override
//    public void destroy() {
//        // resource release
//    }
//
//    @Override
//    public ServletConfig getServletConfig() {
//        return this.servletConfig;
//    }
//
//    @Override
//    public String getServletInfo() {
//        return null;
//    }
//}
