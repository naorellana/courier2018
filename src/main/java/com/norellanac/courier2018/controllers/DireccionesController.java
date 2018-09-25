
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Departamento;
import java.io.IOException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DireccionesController {
    //@Autowired	
    private JdbcTemplate jdbcTemplate;
    public DireccionesController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    @GetMapping("/departamento")
	public String departamento(HttpServletRequest req) {
                String sql="select * from ta_departamento";
                List datos=this.jdbcTemplate.queryForList(sql);
		req.setAttribute("datos",datos);
		//req.setAttribute("mode", "BOOK_VIEW");
		return "direcciones/home_1";
	}
        
    @GetMapping("/newDep")
    public String neww(HttpServletRequest req) {
        //String sql="select * from usuarios order by id desc";
        //List usuarios=this.jdbcTemplate.queryForList(sql);
        //req.setAttribute("usuarios",usuarios);
        req.setAttribute("action", "saveDep");
        return "direcciones/add_U_1";
    }

    @GetMapping("saveDep")
    public void guardar(@ModelAttribute Departamento objetoDB,  HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into ta_departamento (ID_DEPTO,ID_PAIS,DEPTO) values (?,?,?)",
                objetoDB.getID_DEPTO(), objetoDB.getID_PAIS(), objetoDB.getDEPTO());
        //req.setAttribute("books", springService.findAllBooks());
        //req.setAttribute("mode", "BOOK_VIEW");
        resp.sendRedirect("/departamento");
    }

    @GetMapping("editDep")
    public String edit(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM ta_departamento WHERE ID_DEPTO='" + id + "'";
        List usuarios = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("usuarios", usuarios.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateDep");
        return "direcciones/add_U_1";
    }

    @GetMapping("/deleteDep")
    public void delete(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from ta_departamento "
                + "where "
                + "ID_DEPTO=? ",
                id);
        resp.sendRedirect("departamento");
    }

    @GetMapping("/updateDep")
    public void update(@ModelAttribute Departamento objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update ta_departamento "
                + "set ID_DEPTO=?,"
                + " ID_PAIS=?,"
                + "DEPTO=? ",
                objDb.getID_DEPTO(), objDb.getID_PAIS(), objDb.getDEPTO() );
        resp.sendRedirect("departamento");
    }

    
}
