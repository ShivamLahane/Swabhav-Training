package com.techlab.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.Transaction;
import com.techlab.services.PassbookFileCreatorService;

@WebServlet("/export")
public class ExportPassbookController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public ExportPassbookController()
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        response.setHeader("Content-disposition", "passbook");
        HttpSession session = request.getSession();
        List<Transaction> transactions = (List<Transaction>) session.getAttribute("transactions");
        PassbookFileCreatorService fileCreator = new PassbookFileCreatorService();
        String file = fileCreator.createFile(transactions);
//        MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
//        String path = file.getAbsolutePath();
//        System.out.println(path);
//        String mimeType = mimeTypesMap.getContentType(file.getName());
        response.setContentType("text/csv");
        OutputStream out = response.getOutputStream();
//        FileInputStream in = new FileInputStream(path);
//        byte[] buffer = new byte[4096];
//        int length;
//        while ((length = in.read(buffer)) > 0) {
//            out.write(buffer, 0, length);
//        }
//        in.close();
        out.write(file.getBytes());
        out.flush();
//		response.sendRedirect("http://localhost:8080/bank-app/passbook");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
