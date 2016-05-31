package com.lnt.poc;


import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.TaxPayer;

/**
 * Servlet implementation class JavaToXmlServlet
 */
@WebServlet("/JavaToXmlServlet")
public class JavaToXmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaToXmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
        File file = new File("F://TaxPayer.xml");

		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String pan = request.getParameter("pan");
				
		String dateOfBirth = request.getParameter("dateOfBirth");		
		
		String assessmentYear = request.getParameter("assessmentYear");
		BigDecimal income = new BigDecimal(request.getParameter("income"));
		BigDecimal tds = new BigDecimal(request.getParameter("tds"));
		BigDecimal taxDeducted = new BigDecimal(request.getParameter("taxDeducted"));
		
		try {
			JAXBContext context = JAXBContext.newInstance(TaxPayer.class);
			Marshaller marshaller = context.createMarshaller();

			marshaller.marshal(new TaxPayer(name, address, pan, dateOfBirth, assessmentYear, income, tds, taxDeducted ), file);
			
			response.sendRedirect("Result.jsp");
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
