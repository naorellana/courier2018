
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Departamento;
import com.norellanac.courier2018.models.Direccion;
import com.norellanac.courier2018.models.Estado;
import com.norellanac.courier2018.models.Municipio;
import com.norellanac.courier2018.models.Pais;
import java.io.IOException;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrackingController {
    //@Autowired	
    private JdbcTemplate jdbcTemplate;
    public TrackingController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    //************tabla ESTADO*********
    @GetMapping("/estado")
    public String estado(HttpServletRequest req) {
        String sql = "select * from ta_estado order by ID_ESTADO desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "estados/table";
    }

    @GetMapping("/newEstado")
    public String newEstado(HttpServletRequest req) {
        req.setAttribute("action", "savePais");
        return "estados/add";
    }

    @GetMapping("saveEstado")
    public void saveEstado(@ModelAttribute Estado objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into ta_estado (ID_ESTADO,ESTADO) values (?,?)",
                objetoDB.getID_ESTADO(), objetoDB.getESTADO());
        resp.sendRedirect("/estado");
    }
    
    @GetMapping("/deleteEstado")
    public void deleteEstado(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from ta_pais "
                + "where "
                + "ID_ESTADO=? ",
                id);
        resp.sendRedirect("estado");
    }

    @GetMapping("editEstado")
    public String editEstado(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM ta_estado WHERE ID_ESTADO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateEstado");
        return "estados/add";
    }    

    @GetMapping("/updateEstado")
    public void updateEstado(@ModelAttribute Estado objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update ta_estado "
                + "set ESTADO=?"
                + "where ID_ESTADO=? ",
                objDb.getESTADO(), objDb.getID_ESTADO());
        resp.sendRedirect("estado");
    }
    //*******************************************************************************************
    
}
