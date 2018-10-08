<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class=" ">
        <form class=" center-align" action="${action}">
            <h1>tipoUsuario </h1>
            <div class="">
                <div class="input-field col 12">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_USUARIO"  placeholder="Ingrese ID" 
                           value="${data.ID_USUARIO}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col 12">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="text" class="validate" name="TIPOUSUARIO"  placeholder="Descripción" 
                           value="${data.TIPOUSUARIO}">
                    <label for="icon_telephone">DESCRIPCION</label>
                </div>
                <div class="input-field col 12">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="password" class="validate" name="PASS"  placeholder="Descripción" 
                           value="${data.PASS}">
                    <label for="icon_telephone">DESCRIPCION</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />
