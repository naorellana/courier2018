<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class=" ">
        <form class=" center-align" action="${action}">
            <h1>Cliente </h1>
            <div class="row">
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_CLIENTE"  placeholder="Ingrese ID" 
                           value="${data.ID_CLIENTE}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate"  name="NIT"  placeholder="NIT" 
                           value="${data.NIT}">
                    <label for="icon_telephone">NIT</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_DIRECCION"  placeholder="ID_DIRECCION ID" 
                           value="${data.ID_DIRECCION}">
                    <label for="icon_prefix">ID_DIRECCION</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate" name="ID_PERSONA"  placeholder="ID_PERSONA" 
                           value="${data.ID_PERSONA}">
                    <label for="icon_telephone">ID_PERSONA</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="APELLIDOS" type="number" class="validate" name="ID_SERVICIO"  placeholder="ID_SERVICIO" 
                           value="${data.ID_SERVICIO}">
                    <label for="APELLIDOS">ID_SERVICIO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="number" class="validate"  name="TELEFONO"  placeholder="TELEFONO" 
                           value="${data.TELEFONO}">
                    <label for="icon_telephone">TELEFONO</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>
                        <br>


<jsp:include page="../footer.jsp" />
