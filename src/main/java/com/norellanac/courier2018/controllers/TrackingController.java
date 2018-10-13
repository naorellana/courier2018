
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Cliente;
import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Departamento;
import com.norellanac.courier2018.models.Detalle;
import com.norellanac.courier2018.models.Direccion;
import com.norellanac.courier2018.models.Estado;
import com.norellanac.courier2018.models.Municipio;
import com.norellanac.courier2018.models.Pais;
import com.norellanac.courier2018.models.Tracking;
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
    
    
    //************tabla newTracking******
    @GetMapping("/newTracking")
    public String newTracking(HttpServletRequest req) {
        req.setAttribute("action", "saveTracking");
        return "tracking/add";
    }

    @GetMapping("saveTracking")
    public void saveTracking(@ModelAttribute Tracking objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_TRACKING (TRACKING_NUMBER,ID_ESTADO, ID_PAQUETE, ID_FLOTILLA, ID_REMITENTE, ID_DESTINATARIO, FECHA_ENVIO,  FECHA_ENTREGA) values (?,?,?,?,?,?,?,?)",
                objetoDB.getTRACKING_NUMBER(), objetoDB.getID_ESTADO(), objetoDB.getID_PAQUETE(), objetoDB.getID_FLOTILLA(), objetoDB.getID_REMITENTE(), objetoDB.getID_DESTINATARIO(), 
                objetoDB.getFECHA_ENVIO(), objetoDB.getFECHA_ENTREGA());
        resp.sendRedirect("/tracking");
    }

    @GetMapping("editTracking")
    public String editTracking(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_TRACKING WHERE TRACKING_NUMBER='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateTracking");
        return "tracking/add";
    }

    @GetMapping("/updateTracking")
    public void   updateTracking (@ModelAttribute Tracking objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_TRACKING "
                + "set ID_ESTADO=?,"
                + "ID_PAQUETE=?,"
                + "ID_FLOTILLA=?,"
                + "ID_REMITENTE=?,"
                + "ID_DESTINATARIO=?,"
                + "FECHA_ENVIO=?,"
                + "FECHA_ENTREGA=?,"
                + "where TRACKING_NUMBER=? ",
                objetoDB.getID_ESTADO(), objetoDB.getID_PAQUETE(), objetoDB.getID_FLOTILLA(), objetoDB.getID_REMITENTE(), objetoDB.getID_DESTINATARIO(), 
                objetoDB.getFECHA_ENVIO(), objetoDB.getFECHA_ENTREGA(), objetoDB.getTRACKING_NUMBER());
        resp.sendRedirect("tracking");
    }

    @GetMapping("/tracking")
    public String tracking(HttpServletRequest req) {
        String sql = "select * from TA_TRACKING order by TRACKING_NUMBER desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "tracking/table";
    }

    @GetMapping("/deleteTracking")
    public void deleteTracking(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_TRACKING "
                + "where "
                + "TRACKING_NUMBER=? ",
                id);
        resp.sendRedirect("tracking");
    }
    //*******************************************************************************************
    
        //************tabla newTracking******
    @GetMapping("/newDetalle")
    public String newDetalle(HttpServletRequest req) {
        req.setAttribute("action", "saveDetalle");
        return "detalles/add";
    }

    @GetMapping("saveDetalle")
    public void saveDetalle(@ModelAttribute Detalle objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("insert into TA_DETALLE_FACTURA (ID_DETALLE, ID_FACTURA, ID_PAQUETE, NUMERO_UNIDADES, PRECIO, IVA, TOTAL, GARANTIA) values (?,?,?,?,?,?,?,?)",
                objetoDB.getID_DETALLE(), objetoDB.getID_FACTURA(), objetoDB.getID_PAQUETE(), objetoDB.getNUMERO_UNIDADES(), objetoDB.getPRECIO(), objetoDB.getIVA(),objetoDB.getTOTAL(), objetoDB.getGARANTIA());
        resp.sendRedirect("/detalle");
    }

    @GetMapping("editDetalle")
    public String editDetalle(@RequestParam int id, HttpServletRequest req) {
        String sql = "SELECT * FROM TA_DETALLE_FACTURA WHERE ID_DETALLE='" + id + "'";
        List data = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("data", data.get(0));//obtiene un array con un registro en la posicion 0
        req.setAttribute("action", "updateDetalle");
        return "detalles/add";
    }

    @GetMapping("/updateDetalle")
    public void updateDetalle(@ModelAttribute Detalle objetoDB, HttpServletResponse resp) throws IOException {
        jdbcTemplate.update("update TA_DETALLE_FACTURA "
                + "set ID_FACTURA=?,"
                + "ID_PAQUETE=?,"
                + "NUMERO_UNIDADES=?,"
                + "PRECIO=?,"
                + "IVA=?,"
                + "TOTAL=?,"
                + "GARANTIA=?"
                + "where ID_DETALLE=? ",
                objetoDB.getID_FACTURA(), objetoDB.getID_PAQUETE(), objetoDB.getNUMERO_UNIDADES(), objetoDB.getPRECIO(), objetoDB.getIVA(),
                objetoDB.getTOTAL(), objetoDB.getGARANTIA(), objetoDB.getID_DETALLE());
        resp.sendRedirect("detalle");
    }

    @GetMapping("/detalle")
    public String detalle(HttpServletRequest req) {
        String sql = "select * from TA_DETALLE_FACTURA order by ID_DETALLE desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        req.setAttribute("datos", datos);
        //req.setAttribute("mode", "BOOK_VIEW");
        return "detalles/table";
    }

    @GetMapping("/deleteDetalle")
    public void deleteDetalle(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                "delete from TA_DETALLE_FACTURA "
                + "where "
                + "ID_DETALLE=? ",
                id);
        resp.sendRedirect("detalle");
    }
    //*******************************************************************************************

    
}
