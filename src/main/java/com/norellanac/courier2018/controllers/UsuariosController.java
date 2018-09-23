
package com.norellanac.courier2018.controllers;


import com.norellanac.courier2018.models.Conectar;
import com.norellanac.courier2018.models.Usuarios;
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
public class UsuariosController {
    //@Autowired	
    private JdbcTemplate jdbcTemplate;
    public UsuariosController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    @GetMapping("/inicio")
	public String init(HttpServletRequest req) {
                String sql="select * from usuarios order by id desc";
                List datos=this.jdbcTemplate.queryForList(sql);
		req.setAttribute("datos",datos);
		//req.setAttribute("mode", "BOOK_VIEW");
		return "home_1";
	}
    @GetMapping("/login")
	public String log(HttpServletRequest req) {
            String sql="CREATE TABLE nuevos\n" +
"( customer_id number(10) NOT NULL,\n" +
"  customer_name varchar2(50) NOT NULL,\n" +
"  city varchar2(50)\n" +
")";
                jdbcTemplate.execute(sql);
		return "login";
	}
    @GetMapping("home")
    public ModelAndView home_1_1()
    {
        ModelAndView mav=new ModelAndView();
        String sql="select * from usuarios order by id desc";
        List datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("datos",datos);
        mav.setViewName("home_1");
        return mav;
    }
    @GetMapping("/new")
	public String neww(HttpServletRequest req) {
                //String sql="select * from usuarios order by id desc";
                //List usuarios=this.jdbcTemplate.queryForList(sql);
		//req.setAttribute("usuarios",usuarios);
		req.setAttribute("action", "save");
		return "add_U_1";
	}
    
    @GetMapping("save")
	public void guardar( @ModelAttribute Usuarios usuarios, BindingResult bindingResult, HttpServletResponse resp) throws IOException{
		jdbcTemplate.update
        (
        "insert into usuarios (id,nombre,correo,telefono ) values (?,?,?,?)",
         usuarios.getId(), usuarios.getNombre(),usuarios.getCorreo(),usuarios.getTelefono()
        ); 
		//req.setAttribute("books", springService.findAllBooks());
		//req.setAttribute("mode", "BOOK_VIEW");
		resp.sendRedirect("/home");
	} 
        
       @GetMapping("edit")
	public String edit(@RequestParam int id, HttpServletRequest req) {
            String sql = "SELECT * FROM usuarios WHERE id='" + id+"'";
            List usuarios=this.jdbcTemplate.queryForList(sql);
		req.setAttribute("usuarios", usuarios.get(0));//obtiene un array con un registro en la posicion 0
                req.setAttribute("action", "update");
		return "add_U_1";
	} 
        
        @GetMapping("/delete")
	public void delete(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.jdbcTemplate.update(
                    "delete from usuarios "
                + "where "
                + "id=? ",
        id);
        resp.sendRedirect("/home");
    }
        
        @GetMapping("/update")
	public void update( @ModelAttribute Usuarios u,  HttpServletResponse resp) throws IOException{
		jdbcTemplate.update(
                    "update usuarios "
                + "set nombre=?,"
                + " correo=?,"
                + "telefono=? "
                + "where "
                + "id=? ",
         u.getNombre(),u.getCorreo(),u.getTelefono(),u.getId());
		resp.sendRedirect("/home");
	} 
    
}
