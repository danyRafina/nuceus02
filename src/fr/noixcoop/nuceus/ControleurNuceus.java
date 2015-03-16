package fr.noixcoop.nuceus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControleurNuceus
 */
public class ControleurNuceus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MetierVarietes metierVarietes ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurNuceus() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException {
    	metierVarietes = new MetierVarietes();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
