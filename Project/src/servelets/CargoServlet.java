package servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Cargo;

/**
 * Servlet implementation class CargoServlet
 */
@WebServlet("/CargoServlet")
public class CargoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CargoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		try {
			switch(action) {
			case "add": insertCargo(request,response);
						break;
						
			case "delete": deleteCargo(request,response);
						   break;
						   
			case "update": updateCargo(request,response);
			   			   break;
			   
			case "View": ViewCargo(request,response);
			   			   break;
			   			   
			default: showDefault(request , response);
					 break;
			}
		}
		}

	private void showDefault(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void ViewCargo(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	
	}

	private void updateCargo(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void deleteCargo(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void insertCargo(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Cargo ca = new Cargo();
		ca.setCargo_Id(request.getParameter("cargo_Id"));
		ca.setShip_Id(request.getParameter("Ship_Id"));
		ca.setStartDate(request.getParameter("StartDate"));
		ca.setEndDate(request.getParameter("EndDate"));
		ca.setCargoContent(request.getParameter("CargoContent"));
		ca.setStatus(request.getParameter("Status"));
		ca.setLastPort(request.getParameter("LastPort"));
		ca.setNextPort(request.getParameter("NextPort"));
		
		ca.CargoFreightInsert();
		try {
			request.getRequestDispatcher("/Home.jsp").forward(request,response);
		} catch(ServletException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
