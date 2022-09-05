package controller;

import factories.FactoryDao;
import javabeans.Cliente;
import modelo.DaoClientes;

public class AutenticacionController {

	public boolean autenticar(String user, String pwd) {
		DaoClientes daoClientes=FactoryDao.getDaoClientes();
		return daoClientes.autenticar(user, pwd);
	}
	public Cliente obtenerCliente(String user, String pwd) {
		DaoClientes daoClientes=FactoryDao.getDaoClientes();
		return daoClientes.getCliente(user, pwd);
	}
}
