import java.sql.SQLException;

import aduran.com.crud.implement.EnviarQuery;
import aduran.com.exceptions.GenericException;



public class TestAlumno2 {

	public static void main(String[] args) throws SQLException, GenericException {
									
				EnviarQuery query = new EnviarQuery();
				
				
				query.enviarQueryCreate();
				query.enviarQueryConsulta();
				query.enviarQueryDelete(3);
				query.enviarQueryUpdate(2);
				
				
			
				
}
}	