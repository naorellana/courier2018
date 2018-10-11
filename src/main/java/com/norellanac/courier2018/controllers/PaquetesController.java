
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Departamento;
import com.norellanac.courier2018.models.Destinatario;
import com.norellanac.courier2018.models.Direccion;
import com.norellanac.courier2018.models.Municipio;
import com.norellanac.courier2018.models.Pais;
import com.norellanac.courier2018.models.Remitente;
import com.norellanac.courier2018.models.Servicio;
import com.norellanac.courier2018.models.Vehiculo;
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
public class PaquetesController {
    //@Autowired	
    private JdbcTemplate jdbcTemplate;
    public PaquetesController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    //************tabla destinatario*********
    @GetMapping("/newDestinatario")
    public String newDestinatario (HttpServletRequest req) {
        //String sql="select * from usuarios order by id desc";
        //List usuarios=this.jdbcTemplate.queryForList(sql);
        //req.setAttribute("usuarios",usuarios);
        req.setAttribute("action", "saveDestinatario");
        return "destinatarios/add";
    }

    @GetMapping("saveDestinatario")
    public void saveDestinatario(@ModelAttribute Destinatario objetoDB,  HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_DESTINATARIO (ID_DESTINATARIO, ID_CLIENTE,ID_DIRECCION) values (?,?,?)",
                objetoDB.getID_DESTINATARIO(), objetoDB.getID_CLIENTE(), objetoDB.getID_DIRECCION() );
        //req.setAttribute("books", springService.findAllBooks());
        //req.setAttribute("mode", "BOOK_VIEW");
        resp.sendRedirect("/destinatario");
    }

    @GetMapping("editDestinatario")
    public String editDestinatario(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_DESTINATARIO WHERE ID_DESTINATARIO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateDestinatario");
        return "destinatarios/add";
    }
    
        @GetMapping("/updateDestinatario")
    public void updateDestinatario(@ModelAttribute Destinatario objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_DESTINATARIO "
                + "set ID_CLIENTE=?,"
                + "ID_DIRECCION=? "
                + "where ID_DESTINATARIO=? ",
                objDb.getID_CLIENTE(),objDb.getID_DIRECCION(), objDb.getID_DESTINATARIO());
        resp.sendRedirect("destinatario");
    }

    @GetMapping("/deleteDestinatario")
    public void deleteDestinatario(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_DESTINATARIO "
                + "where "
                + "ID_DESTINATARIO=? ",
                id);
        resp.sendRedirect("destinatario");
    }
    
    @GetMapping("/destinatario")
    public String destinatario(HttpServletRequest req) {
        String sql = "select * from TA_DESTINATARIO order by ID_DESTINATARIO desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "destinatarios/table";
    }

    //*******************************************************************************************
    
    
    //************tabla destinatario*********
    @GetMapping("/newRemitente")
    public String newRemitente(HttpServletRequest req) {
        //String sql="select * from usuarios order by id desc";
        //List usuarios=this.jdbcTemplate.queryForList(sql);
        //req.setAttribute("usuarios",usuarios);
        req.setAttribute("action", "saveRemitente");
        return "remitentes/add";
    }

    @GetMapping("saveRemitente")
    public void saveRemitente(@ModelAttribute Remitente objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_REMITENTE (ID_REMITENTE, ID_CLIENTE,ID_DIRECCION) values (?,?,?)",
                objetoDB.getID_REMITENTE(), objetoDB.getID_CLIENTE(), objetoDB.getID_DIRECCION());
        //req.setAttribute("books", springService.findAllBooks());
        //req.setAttribute("mode", "BOOK_VIEW");
        resp.sendRedirect("/remitente");
    }

    @GetMapping("editRemitente")
    public String editRemitente(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_REMITENTE WHERE ID_REMITENTE='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateRemitente");
        return "remitentes/add";
    }

    @GetMapping("/updateRemitente")
    public void updateRemitente(@ModelAttribute Remitente objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_REMITENTE "
                + "set ID_CLIENTE=?,"
                + "ID_DIRECCION=? "
                + "where ID_REMITENTE=? ",
                objDb.getID_CLIENTE(), objDb.getID_DIRECCION(), objDb.getID_REMITENTE());
        resp.sendRedirect("remitente");
    }

    @GetMapping("/deleteRemitente")
    public void deleteRemitente(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_REMITENTE "
                + "where "
                + "ID_REMITENTE=? ",
                id);
        resp.sendRedirect("remitente");
    }

    @GetMapping("/remitente")
    public String remitente(HttpServletRequest req) {
        String sql = "select * from TA_REMITENTE order by ID_REMITENTE desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "remitentes/table";
    }

    //*******************************************************************************************
    
    //************tabla Servicio*********
    @GetMapping("/newServicio")
    public String newServicio(HttpServletRequest req) {
        //String sql="select * from usuarios order by id desc";
        //List usuarios=this.jdbcTemplate.queryForList(sql);
        //req.setAttribute("usuarios",usuarios);
        req.setAttribute("action", "saveServicio");
        return "servicios/add";
    }

    @GetMapping("saveServicio")
    public void saveServicio(@ModelAttribute Servicio objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_SERVICIO (ID_SERVICIO, TIPO_SERVICIO) values (?,?)",
                objetoDB.getID_SERVICIO(), objetoDB.getTIPO_SERVICIO());
        //req.setAttribute("books", springService.findAllBooks());
        //req.setAttribute("mode", "BOOK_VIEW");
        resp.sendRedirect("/servicio");
    }

    @GetMapping("editServicio")
    public String editServicio(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_SERVICIO WHERE ID_SERVICIO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateServicio");
        return "servicios/add";
    }

    @GetMapping("/updateServicio")
    public void updateServicio(@ModelAttribute Servicio objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_SERVICIO "
                + "set TIPO_SERVICIO=?"
                + "where ID_SERVICIO=? ",
                objDb.getTIPO_SERVICIO(),  objDb.getID_SERVICIO());
        resp.sendRedirect("servicio");
    }

    @GetMapping("/deleteServicio")
    public void deleteServicio(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_SERVICIO "
                + "where "
                + "ID_SERVICIO=? ",
                id);
        resp.sendRedirect("servicio");
    }

    @GetMapping("/servicio")
    public String servicio(HttpServletRequest req) {
        String sql = "select * from TA_SERVICIO order by ID_SERVICIO desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "servicios/table";
    }

    //*******************************************************************************************
    
    
    //************tabla Servicio*********
    @GetMapping("/newVehiculo")
    public String newVehiculo (HttpServletRequest req) {
        //String sql="select * from usuarios order by id desc";
        //List usuarios=this.jdbcTemplate.queryForList(sql);
        //req.setAttribute("usuarios",usuarios);
        req.setAttribute("action", "saveVehiculo");
        return "vehiculos/add";
    }

    @GetMapping("saveVehiculo")
    public void saveVehiculo(@ModelAttribute Vehiculo objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_VEHICULO (ID_VEHICULO, PLACA, PESO, MARCA, COLOR, TIPO ) values (?,?,?,?,?,?)",
                objetoDB.getID_VEHICULO(), objetoDB.getPLACA(), objetoDB.getPESO(), objetoDB.getMARCA(), objetoDB.getCOLOR(), objetoDB.getTIPO());
        resp.sendRedirect("/vehiculo");
    }

    @GetMapping("editVehiculo")
    public String editVehiculo(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_VEHICULO WHERE ID_VEHICULO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateVehiculo");
        return "vehiculos/add";
    }

    @GetMapping("/updateVehiculo")
    public void updateVehiculo(@ModelAttribute Vehiculo objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_VEHICULO "
                + "set PLACA=?, "
                + "PESO=?, "
                + "MARCA=?, "
                + "COLOR=?, "
                + "TIPO=? "
                + "where ID_VEHICULO=?",
                objDb.getPLACA(),objDb.getPESO(), objDb.getMARCA(), objDb.getCOLOR(), objDb.getTIPO(), objDb.getID_VEHICULO());
        resp.sendRedirect("vehiculo");
    }

    @GetMapping("/deleteVehiculo")
    public void deleteVehiculo(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_VEHICULO "
                + "where "
                + "ID_VEHICULO=? ",
                id);
        resp.sendRedirect("vehiculo");
    }

    @GetMapping("/vehiculo")
    public String vehiculo(HttpServletRequest req) {
        String sql = "select * from TA_VEHICULO order by ID_VEHICULO desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "vehiculos/table";
    }

    //*******************************************************************************************
    
    //************tabla Servicio*********
    @GetMapping("/newFlotilla")
    public String newFlotilla (HttpServletRequest req) {
        //String sql="select * from usuarios order by id desc";
        //List usuarios=this.jdbcTemplate.queryForList(sql);
        //req.setAttribute("usuarios",usuarios);
        req.setAttribute("action", "saveFlotilla");
        return "vehiculos/add";
    }

    @GetMapping("saveFlotilla")
    public void saveFlotilla(@ModelAttribute Vehiculo objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_FLOTA (ID_VEHICULO, PLACA, PESO, MARCA, COLOR, TIPO ) values (?,?,?,?,?,?)",
                objetoDB.getID_VEHICULO(), objetoDB.getPLACA(), objetoDB.getPESO(), objetoDB.getMARCA(), objetoDB.getCOLOR(), objetoDB.getTIPO());
        resp.sendRedirect("/vehiculo");
    }

    @GetMapping("editFlotilla")
    public String editFlotilla(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_FLOTA WHERE ID_VEHICULO='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateFlotilla");
        return "vehiculos/add";
    }

    @GetMapping("/updateFlotilla")
    public void updateFlotilla(@ModelAttribute Vehiculo objDb, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_FLOTA "
                + "set PLACA=?, "
                + "PESO=?, "
                + "MARCA=?, "
                + "COLOR=?, "
                + "TIPO=? "
                + "where ID_VEHICULO=?",
                objDb.getPLACA(),objDb.getPESO(), objDb.getMARCA(), objDb.getCOLOR(), objDb.getTIPO(), objDb.getID_VEHICULO());
        resp.sendRedirect("vehiculo");
    }

    @GetMapping("/deleteFlotilla")
    public void deleteFlotilla (@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_FLOTA "
                + "where "
                + "ID_VEHICULO=? ",
                id);
        resp.sendRedirect("vehiculo");
    }

    @GetMapping("/flotilla")
    public String flotilla(HttpServletRequest req) {
        String sql = "select * from TA_VEHICULO order by ID_VEHICULO desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "vehiculos/table";
    }

    //*******************************************************************************************


    

    
}
