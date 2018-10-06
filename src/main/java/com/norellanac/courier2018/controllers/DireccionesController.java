
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Departamento;
import com.norellanac.courier2018.models.Direccion;
import com.norellanac.courier2018.models.Municipio;
import com.norellanac.courier2018.models.Pais;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.driver.DatabaseError;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
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
    //************tabla Departamento*********
    @GetMapping("/departamento")
	public String departamento(HttpServletRequest req) {
                String sql="select * from ta_departamento";
                List datos=this.jdbcTemplate.queryForList(sql);
		req.setAttribute("datos",datos);
		//req.setAttribute("mode", "BOOK_VIEW");
		return "departamentos/table";
	}
        
    @GetMapping("/newDep")
    public String neww(HttpServletRequest req) {
        //String sql="select * from usuarios order by id desc";
        //List usuarios=this.jdbcTemplate.queryForList(sql);
        //req.setAttribute("usuarios",usuarios);
        req.setAttribute("action", "saveDep");
        return "departamentos/add";
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
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateDep");
        return "departamentos/add";
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
                + "set ID_PAIS=?,"
                + "DEPTO=? "
                + "where ID_DEPTO=? ",
                objDb.getID_PAIS(), objDb.getDEPTO(), objDb.getID_DEPTO());
        resp.sendRedirect("departamento");
    }
    //*******************************************************************************************
    
    
    //************tabla MUNICIPIO*********
    @GetMapping("/municipio")
    public String municipio(HttpServletRequest req) {
        String sql = "select * from ta_municipio order by ID_MUN desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "municipios/table";
    }

    @GetMapping("/newMun")
    public String newMun(HttpServletRequest req) {
        String sql = "SELECT * FROM ta_departamento";
        List dependencia = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("dependencia", dependencia);
        req.setAttribute("action", "saveMun");
        return "municipios/add";
    }

    @GetMapping("saveMun")
    public void saveMun(@ModelAttribute Municipio objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into ta_municipio (ID_MUN,ID_DEPTO,MUNICIPIO) values (?,?,?)",
                objetoDB.getID_MUN(), objetoDB.getID_DEPTO(), objetoDB.getMUNICIPIO());
        resp.sendRedirect("/municipio");
    }

    @GetMapping("/updateMun")
    public void updateMun(@ModelAttribute Municipio objDb, HttpServletResponse resp, HttpServletRequest req) throws IOException {
        String e;
        //try{
            jdbcTemplate.update("update ta_municipio "
                    + "set ID_DEPTO=?,"
                    + "MUNICIPIO=? "
                    + "where ID_MUN=? ",
                    objDb.getID_DEPTO(), objDb.getMUNICIPIO(), objDb.getID_MUN());
            resp.sendRedirect("municipio");
        //}
        
    }
    
    @GetMapping("editMun")
    public String editMun(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM ta_municipio WHERE ID_MUN='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        
        String sqlDep = "SELECT * FROM ta_departamento";
        List dependencia = this.jdbcTemplate.queryForList(sqlDep);
        req.setAttribute("dependencia", dependencia);

        
        req.setAttribute("action", "updateMun");
        return "municipios/add";
    }

    @GetMapping("/deleteMun")
    public void deleteMun(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from ta_municipio "
                + "where "
                + "ID_MUN=? ",
                id);
        resp.sendRedirect("municipio");
    }
    //*******************************************************************************************
   
    
    
    //************tabla PAIS*********
    @GetMapping("/pais")
    public String pais(HttpServletRequest req) {
        String sql = "select * from ta_pais order by ID_PAIS desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "pais/table";
    }

    @GetMapping("/newPais")
    public String newPais(HttpServletRequest req) {
        req.setAttribute("action", "savePais");
        return "pais/add";
    }

    @GetMapping("savePais")
    public void savePais(@ModelAttribute Pais objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into ta_pais (ID_PAIS,PAIS) values (?,?)",
                objetoDB.getID_PAIS(), objetoDB.getPAIS());
        resp.sendRedirect("/pais");
    }

    @GetMapping("editPais")
    public String editPais(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM ta_pais WHERE ID_PAIS='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updatePais");
        return "pais/add";
    }

    @GetMapping("/deletePais")
    public void deletePais(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from ta_pais "
                + "where "
                + "ID_PAIS=? ",
                id);
        resp.sendRedirect("pais");
    }

    @GetMapping("/updatePais")
    public void updatePais(@ModelAttribute Pais objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update ta_pais "
                + "set PAIS=?"
                + "where ID_PAIS=? ",
                objDb.getPAIS(),objDb.getID_PAIS());
        resp.sendRedirect("pais");
    }
    //*******************************************************************************************
    
    
    //************tabla DIRECCIONES*********
    @GetMapping("/direccion")
    public String direccion(HttpServletRequest req) {
        String sql = "select * from ta_direccion order by ID_DIRECCION desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "direcciones/table";
    }

    @GetMapping("/newDir")
    public String newDir(HttpServletRequest req) {
        String sql = "SELECT * FROM ta_municipio";
        List dependencia = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("dependencia", dependencia);
        req.setAttribute("action", "saveDir");
        return "direcciones/add";
    }

    @GetMapping("saveDir")
    public void saveDir(@ModelAttribute Direccion objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into ta_direccion (ID_DIRECCION,ID_MUN,CALLE,AVENIDA,ZONA) values (?,?,?,?,?)",
                objetoDB.getID_DIRECCION(), objetoDB.getID_MUN(), objetoDB.getCALLE(),objetoDB.getAVENIDA(), objetoDB.getZONA());
        resp.sendRedirect("/direccion");
    }

    @GetMapping("/updateDir")
    public void updateDir(@ModelAttribute Direccion objDb, HttpServletResponse resp, HttpServletRequest req) throws IOException {
        //try{
        jdbcTemplate.update("update ta_direccion "
                + "set ID_MUN=?,"
                + "CALLE=?, "
                + "AVENIDA=?, "
                + "ZONA=? "
                + "where ID_DIRECCION=? ",
                objDb.getID_MUN(), objDb.getCALLE(), objDb.getAVENIDA(), objDb.getZONA(), objDb.getID_DIRECCION());
        resp.sendRedirect("direccion");
        //}

    }

    @GetMapping("editDir")
    public String editDir(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM ta_direccion WHERE ID_DIRECCION='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0

        String sqlDep = "SELECT * FROM ta_municipio";
        List dependencia = this.jdbcTemplate.queryForList(sqlDep);
        req.setAttribute("dependencia", dependencia);

        req.setAttribute("action", "updateDir");
        return "direcciones/add";
    }

    @GetMapping("/deleteDir")
    public void deleteDir(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from ta_direccion "
                + "where "
                + "ID_DIRECCION=? ",
                id);
        resp.sendRedirect("municipio");
    }
    //*******************************************************************************************
    

    
}
