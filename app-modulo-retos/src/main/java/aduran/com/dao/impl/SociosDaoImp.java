package aduran.com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import aduran.com.exceptions.GenericException;
import aduran.com.vo.Socios;

public class SociosDaoImp {

	public static Collection<Socios> findAll() throws GenericException, SQLException {
		EnviarQuery findall = new EnviarQuery();
		Collection<Socios> listaSocios=EnviarQuery.enviarQueryConsulta();
		
		return listaSocios;
	}
	
}
