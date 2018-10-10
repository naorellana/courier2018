
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Cliente;
import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Empleado;
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
        req.setAttribute("action", "saveUsuario");
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
        String sql = "SELECT * FROM TA_USUARIO WHERE ID_USUARIO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateUsuario");
        return "usuarios/add";
    }

    @GetMapping("/updateUsuario")
    public void updateUsuario(@ModelAttribute Usuario objDb, HttpServletResponse resp) throws IOException {
         jdbcTemplate.update("update TA_USUARIO "
                    + "set TIPOUSUARIO=?,"
                    + "PASS=? "
                    + "where ID_USUARIO=? ",
                objDb.getTIPOUSUARIO(),objDb.getPASS(), objDb.getID_USUARIO());
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
        return "personas/add";
    }

    @GetMapping("savePersona")
    public void savePersona(@ModelAttribute Persona objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_PERSONA (ID_PERSONA, DPI, NOMBRES, APELLIDOS, EDAD, NACIONALIDAD ) values (?,?,?,?,?,?)",
                objetoDB.getID_PERSONA(), objetoDB.getDPI(), objetoDB.getNOMBRES(), objetoDB.getAPELLIDOS(), objetoDB.getEDAD(), objetoDB.getNACIONALIDAD());
        resp.sendRedirect("/persona");
    }

    @GetMapping("editPersona")
    public String editPersona(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_PERSONA WHERE ID_PERSONA='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updatePersona");
        return "personas/add";
    }

    @GetMapping("/updatePersona")
    public void updatePersona(@ModelAttribute Persona objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_PERSONA "
                + "set DPI=?, "
                + "NOMBRES=?, "
                + "APELLIDOS=?, "
                + "EDAD=?, "
                + "NACIONALIDAD=? "
                + "where ID_PERSONA=?",
                objDb.getDPI(), objDb.getNOMBRES(),objDb.getAPELLIDOS(),objDb.getEDAD(), objDb.getNACIONALIDAD(), objDb.getID_PERSONA());
        resp.sendRedirect("persona");
    }

    @GetMapping("/persona")
    public String persona(HttpServletRequest req) {
        String sql = "select * from TA_PERSONA order by ID_PERSONA desc";
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
                + "ID_PERSONA=? ",
                id);
        resp.sendRedirect("persona");
    }
    //*******************************************************************************************
    
    //************tabla TA_cliente******
    @GetMapping("/newCliente")
    public String newCliente(HttpServletRequest req) {
        req.setAttribute("action", "saveCliente");
        return "clientes/add";
    }

    @GetMapping("saveCliente")
    public void saveCliente(@ModelAttribute Cliente objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_CLIENTE (ID_CLIENTE,NIT, ID_DIRECCION, ID_PERSONA, ID_SERVICIO, TELEFONO) values (?,?,?,?,?,?)",
                objetoDB.getID_CLIENTE(), objetoDB.getNIT(), objetoDB.getID_DIRECCION(), objetoDB.getID_PERSONA(), objetoDB.getID_SERVICIO(), objetoDB.getTELEFONO());
        resp.sendRedirect("/cliente");
    }

    @GetMapping("editCliente")
    public String editCliente(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_CLIENTE WHERE ID_CLIENTE='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateCliente");
        return "clientes/add";
    }

    @GetMapping("/updateCliente")
    public void updateCliente(@ModelAttribute Cliente objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update ta_cliente "
                + "set NIT=?,"
                + "ID_DIRECCION=?,"
                + "ID_PERSONA=?,"
                + "ID_SERVICIO=?,"
                + "TELEFONO=?"
                + "where ID_CLIENTE=? ",
                objDb.getNIT(), objDb.getID_DIRECCION(), objDb.getID_PERSONA(), objDb.getID_SERVICIO(), objDb.getTELEFONO(), objDb.getID_CLIENTE());
        resp.sendRedirect("cliente");
    }

    @GetMapping("/cliente")
    public String cliente(HttpServletRequest req) {
        String sql = "select * from TA_CLIENTE order by ID_CLIENTE desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "clientes/table";
    }

    @GetMapping("/deleteCliente")
    public void deleteCliente(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_CLIENTE "
                + "where "
                + "ID_CLIENTE=? ",
                id);
        resp.sendRedirect("cliente");
    }
    //*******************************************************************************************
    
        //************tabla TA_EMPLEADO******
    @GetMapping("/newEmpleado")
    public String newEmpleado(HttpServletRequest req) {
        req.setAttribute("action", "saveEmpleado");
        return "empleados/add"; 
    }

    @GetMapping("saveEmpleado")
    public void saveEmpleado(@ModelAttribute Empleado objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_EMPLEADO (ID_EMPLEADO,ID_USUARIO, ID_PERSONA, AREA_PUESTO, SALARIO) values (?,?,?,?,?)",
                objetoDB.getID_EMPLEADO(), objetoDB.getID_USUARIO(), objetoDB.getID_PERSONA(), objetoDB.getAREA_PUESTO(), objetoDB.getSALARIO());
        resp.sendRedirect("/empleado");
    }

    @GetMapping("editEmpleado")
    public String editEmpleado(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_EMPLEADO WHERE ID_EMPLEADO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateEmpleado");
        return "empleados/add";
    }

    @GetMapping("/updateEmpleado")
    public void updateEmpleado(@ModelAttribute Empleado objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_EMPLEADO "
                + "set ID_USUARIO=?,"
                + "ID_PERSONA=?,"
                + "AREA_PUESTO=?,"
                + "SALARIO=?"
                + "where ID_EMPLEADO=? ",
                objDb.getID_USUARIO(), objDb.getID_PERSONA(), objDb.getAREA_PUESTO(), objDb.getSALARIO(), objDb.getID_EMPLEADO());
        resp.sendRedirect("empleado");
    }

    @GetMapping("/empleado")
    public String empleado(HttpServletRequest req) {
        String sql = "select * from TA_EMPLEADO order by ID_EMPLEADO desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "empleados/table";
    }

    @GetMapping("/deleteEmpleado")
    public void deleteEmpleado(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_EMPLEADO "
                + "where "
                + "ID_EMPLEADO=? ",
                id);
        resp.sendRedirect("empleado");
    }
    //*******************************************************************************************
    
    

}
