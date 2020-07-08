package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import idao.IClienteDao;
import model.Cliente;

/**
 * Servlet implementation class AdminCliente
 */
@WebServlet("/AdminCliente")
public class AdminCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IClienteDao clienteDAO;

	public void init() {
		String jdbcUrl = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		String jdbcDriver = getServletContext().getInitParameter("jdbcDriver");

		try {
			clienteDAO = new ClienteDao(jdbcUrl, jdbcDriver, jdbcUsername, jdbcPassword);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");

		System.out.println(action);
		try {

			switch (action) {
			case "index":
				index(request, response);
				break;
			case "listar":
				mostrarCliente(request, response);
				break;
			case "mostrarPorRut":
				mostrarPorRut(request, response);
				break;
			case "actualizar":
				actualizar(request, response);
				break;
			case "eliminar":
				eliminar(request, response);
				break;
			case "crear":
				crear(request, response);
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

	private void index(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

	}

	// CREAR CLIENTE
	private void crear(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("rut");
		String nombre = request.getParameter("nombre");
		String rSocial = request.getParameter("rSocial");
		String giro = request.getParameter("giro");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");
		String rubro = request.getParameter("rubro");

		Cliente cliente = new Cliente(rut, nombre, rSocial, giro, direccion, telefono, correo, rubro);

		boolean crear = clienteDAO.crearCliente(cliente);

		String mensaje = "";

		if (crear)
			mensaje = "El cliente ha sido creado exitosamente";
		else
			mensaje = "Ocurrió un error al crear el cliente";

		request.setAttribute("alerta", mensaje);
		request.getRequestDispatcher("/view/registrarCliente.jsp").forward(request, response);
	}

	// LISTAR CLIENTES
	private void mostrarCliente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/listadoClientes.jsp");

		List<Cliente> lClientes = new ArrayList<Cliente>();

		lClientes = clienteDAO.listarClientes();

		request.setAttribute("lista_clientes", lClientes);

		dispatcher.forward(request, response);

	}

	// MOSTRAR POR RUT
	private void mostrarPorRut(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("id");
		Cliente cliente = clienteDAO.obtenerPorRut(rut);
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("/view/mostrarClientePorRut.jsp").forward(request, response);

	}

	// ACTUALIZAR CLIENTE
	private void actualizar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("rut");
		System.out.println("rut:"+ rut);
		String nombre = request.getParameter("nombre");
		String rSocial = request.getParameter("rSocial");
		String giro = request.getParameter("giro");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");
		String rubro = request.getParameter("rubro");

		Cliente cliente = new Cliente(rut, nombre, rSocial, giro, direccion, telefono, correo, rubro);

		boolean editar = clienteDAO.actualizarCliente(cliente);
		
		List<Cliente> listadoNuevo = clienteDAO.listarClientes();

		String mensaje = "";

		if (editar)
			mensaje = "El cliente se ha editado exitosamente";
		else
			mensaje = "Ocurrió un error al editar el cliente";

		
		request.setAttribute("alerta", mensaje);
		request.setAttribute("lista_clientes", listadoNuevo);
		request.getRequestDispatcher("/view/listadoClientes.jsp").forward(request, response);

	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {

		String rut = request.getParameter("id");
		boolean eliminar = clienteDAO.eliminarCliente(rut);

		List<Cliente> listadoNuevo = clienteDAO.listarClientes();
		

		String mensaje = "";

		if (eliminar)
			mensaje = "El cliente se ha eliminado exitosamente";
		else
			mensaje = "Ocurrió un error al editar el cliente";

		request.setAttribute("alerta", mensaje);
		request.setAttribute("lista_clientes", listadoNuevo);
		
		request.getRequestDispatcher("/view/listadoClientes.jsp").forward(request, response);

	}

}
