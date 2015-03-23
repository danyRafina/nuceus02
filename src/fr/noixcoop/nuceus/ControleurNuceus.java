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
		String action = request.getParameter("action");
		if(action == null)
			action ="visualiser";
		
		if(action.equals("visualiser") || action.equals("annulerAjout")) {
			request.setAttribute("varietes",metierVarietes.consulter());
			getServletContext().getRequestDispatcher("/WEB-INF/vues/vueListe.jsp").forward(request,response);
		}
		else if(action.equals("renseignerAjout")) 
			getServletContext().getRequestDispatcher("/WEB-INF/vues/vueFormulaireAjout.jsp").forward(request,response);
		
		else if (action.equals("ajouter")) {
			String libelle = request.getParameter("libelle");
			String aoc = request.getParameter("aoc");
			boolean aocObtenu = false;
			if(aoc == null ){
				aoc = "non";
				aocObtenu = false;
			}
			else {
				aoc="oui";
				aocObtenu =true;
			}
			boolean ajouterOk = metierVarietes.ajouter(new Variete(libelle,aocObtenu));
			if(ajouterOk) {
				request.setAttribute("libelle",libelle);
				request.setAttribute("aoc",aoc);
				System.out.println("ADA"+metierVarietes.consulter().toString());
				getServletContext().getRequestDispatcher("/WEB-INF/vues/vueResultatAjout.jsp").forward(request,response);
			}
			else 
				getServletContext().getRequestDispatcher("/WEB-INF/vues/vueResultatAjout.jsp").forward(request,response);
				
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
