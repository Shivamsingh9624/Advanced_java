package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content, new Date());
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
//			out.print(note.getId()+":"+ note.getTitle() + ":" +note.getContent());
			Session s = FactoryProvider.getFactory().openSession();
			Transaction tx = s.beginTransaction();
			s.save(note);
			tx.commit();
			out.print("<h1 style='text-align: center'>Note Added Succesfully</h1>");
			out.print("<h1 style='text-align: center'><a href = 'view_notes.jsp'>Click here</a> to view all Notes</h1>");
			s.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
