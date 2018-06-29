package endoaction;

import java.util.List;

import endodao.EndoDAO;
import endodto.EndoDTO;

public class EndoAction {

	private List<EndoDTO> dtolist;


	public String execute(){

		EndoDAO dao = new EndoDAO();
		dtolist = dao.selectAll();





		return "ok";
	}


}
