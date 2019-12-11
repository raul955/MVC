package mvc.cinemvc4.web;
import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mvc.cinemvc4.domain.pelicula;
import mvc.cinemvc4.domain.usuario;
import mvc.cinemvc4.repository.BBDD;
import mvc.cinemvc4.repository.BBDDDAO;


@Controller
@RequestMapping(value="/filmografia")
public class iController {
	
	BBDD BBDD;
	pelicula pel;
	Connection con;
	PreparedStatement pst;
	Statement st;
	ResultSet rs;
	int result;
	String forName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.16:1521:xe";
	String user = "cine";
	String pass = "cine";
	String pagina=null;

    protected final Log logger = LogFactory.getLog(getClass());


    @RequestMapping(method=RequestMethod.GET,value="/hello")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("index");
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/index")
    public ModelAndView indexx(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("index");
    }
    
    
    @RequestMapping(method=RequestMethod.GET, value="/informacion")
    public ModelAndView info(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("informacion");
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/consultaDir")
    public ModelAndView consultaDir(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("consultaDir");
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("login");

	}
    
    @RequestMapping(method = RequestMethod.GET, value = "/newUser")
	public ModelAndView newUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("newUser");

	}
    
    @RequestMapping(method = RequestMethod.GET, value = "/nuevaPelicula")
	public ModelAndView nuevaPelicula(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("nuevaPelicula");

	}
    
    @RequestMapping(method = RequestMethod.GET, value = "/modificarPelicula")
	public ModelAndView modificarPelicula(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("modificarPelicula");

	}
    
    @RequestMapping(method = RequestMethod.GET, value = "/borrarPelicula")
	public ModelAndView borrarPelicula(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("borrarPelicula");

	}
    
    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("welcome");

	}
    
    @RequestMapping(method=RequestMethod.GET, value="/salir")
    public ModelAndView salir(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("salir");
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/login")
    public ModelAndView logearse(HttpServletRequest request) throws ServletException, IOException {

    	BBDD =  new BBDD();
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		try {
			
			List<usuario> usr = BBDD.unsuccesfullLogin(usuario, password);

			if (!usr.isEmpty()) {
				request.setAttribute("listaUsr", usr);
				pagina="login";

			} else {

				request.setAttribute("user", usuario);
				pagina="welcome";

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView(pagina);
		
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/welcome")
    public ModelAndView welcome(HttpServletRequest request) throws ServletException, IOException {

		try {

			List<pelicula> pel = BBDD.mostrarTodo();

			request.setAttribute("listaPel", pel);		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ModelAndView("mantenimiento");
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/nuevaPelicula2")
    public ModelAndView nuevaPelicula2(HttpServletRequest request) throws ServletException, IOException {

		String director = request.getParameter("director");
		String titulo = request.getParameter("titulo");
		String fecha = request.getParameter("fecha");
		int id = Integer.parseInt(request.getParameter("id"));

		try {

			BBDD.insertarPelicula(director, titulo,fecha, id);

			String mensaje = "Película insertada";

			request.setAttribute("men", mensaje);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return new ModelAndView("nuevaPelicula");
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/modificarPelicula2")
    public ModelAndView modificarPelicula2(HttpServletRequest request) throws ServletException, IOException {

    	int id = Integer.parseInt(request.getParameter("id"));
		String director = request.getParameter("director");
		String titulo = request.getParameter("titulo");
		String fecha = request.getParameter("fecha");

		try {

			String mensaje = "Película modificada";

			BBDD.modificarPelicula(director,titulo,fecha,id);

			request.setAttribute("men", mensaje);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("modificarPelicula");
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/borrarPelicula2")
    public ModelAndView borrarPelicula2(HttpServletRequest request) throws ServletException, IOException {

    	int id = Integer.parseInt(request.getParameter("id"));

		try {

			String mensaje = "Película borrada";

			BBDD.borrarPelicula(id);

			request.setAttribute("men", mensaje);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return new ModelAndView("borrarPelicula");
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/alta")
    public ModelAndView alta(HttpServletRequest request) throws ServletException, IOException {

    	String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		try {

			String mensaje = "Usuario insertado";

			BBDD.altaUsuario(usuario, password);

			request.setAttribute("men", mensaje);


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return new ModelAndView("newUser");
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/consultaDir")
    public ModelAndView consultaDir(HttpServletRequest request) throws ServletException, IOException {

    	String director = request.getParameter("director");

		try {
			List<pelicula> pel = BBDD.mostrarTablaPeliculas(director);
			request.setAttribute("listaPel", pel);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ModelAndView("consultaDir");
		
    }

    
    

}
