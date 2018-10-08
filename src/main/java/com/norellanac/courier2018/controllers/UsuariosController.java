
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Persona;
import com.norellanac.courier2018.models.Usuario;
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
public class UsuariosController {
    //@Autowired	
    private JdbcTemplate jdbcTemplate;
    public UsuariosController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    //************tabla TA_USUARIO*********
    
    @GetMapping("/newUsuario")
    public String newUsuario(HttpServletRequest req) {
        req.setAttribute("action", "savePais");
        return "usuarios/add";
    }
    
    @GetMapping("saveUsuario")
    public void saveUsuario(@ModelAttribute Usuario objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_USUARIO (ID_USUARIO,TIPOUSUARIO, PASS) values (?,?,?)",
                objetoDB.getID_USUARIO(), objetoDB.getTIPOUSUARIO() ,objetoDB.getPASS());
        resp.sendRedirect("/usuario");
    }
    
        @GetMapping("editUsuario")
    public String edisuario(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM ta_estado WHERE ID_ESTADO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateUsuario");
        return "usuarios/add";
    }

    @GetMapping("/updateUsuario")
    public void updateUsuario(@ModelAttribute Usuario objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_USUARIO "
                + "set TIPOUSUARIO=?,"
                + "set PASS=?"
                + "where ID_USUARIO=? ",
                objDb.getTIPOUSUARIO(), objDb.getID_USUARIO());
        resp.sendRedirect("usuario");
    }
    
    @GetMapping("/usuario")
    public String usuario(HttpServletRequest req) {
        String sql = "select * from TA_USUARIO order by ID_USUARIO desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "usuarios/table";
    }

    @GetMapping("/deleteUsuario")
    public void deleteUsuario(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from ta_pais "
                + "where "
                + "ID_ESTADO=? ",
                id);
        resp.sendRedirect("usuario");
    }
    //*******************************************************************************************
    
    
    //************tabla PERSONA*********
    @GetMapping("/newPersona")
    public String newPersona(HttpServletRequest req) {
        req.setAttribute("action", "savePersona");
        return "usuarios/add";
    }

    @GetMapping("savePersona")
    public void savePersona(@ModelAttribute Persona objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_PERSONA (DPI, NOMBRES, APELLIDOS, ) values (?,?,?)",
                objetoDB.getDPI(), objetoDB.getNOMBRES(), objetoDB.getAPELLIDOS());
        resp.sendRedirect("/persona");
    }

    @GetMapping("editPersona")
    public String editPersona(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_PERSONA WHERE DPI='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updatePersona");
        return "personas/add";
    }

    @GetMapping("/updatePersona")
    public void updatePersona(@ModelAttribute Usuario objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_PERSONA "
                + "set NOMBRES=?,"
                + "set APELLIDOS=?"
                + "where DPI=? ",
                objDb.getTIPOUSUARIO(), objDb.getID_USUARIO());
        resp.sendRedirect("persona");
    }

    @GetMapping("/persona")
    public String persona(HttpServletRequest req) {
        String sql = "select * from TA_PERSONA order by DPI desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "personas/table";
    }

    @GetMapping("/deletePersona")
    public void deletePersona(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_PERSONA "
                + "where "
                + "ID_ESTADO=? ",
                id);
        resp.sendRedirect("persona");
    }
    //*******************************************************************************************

}
