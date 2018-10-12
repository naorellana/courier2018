<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class="row center-align">
         <h1>Remitente</h1>
        <form class="col s12" action="${action}">
            <div class="row">
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_REMITENTE"  placeholder="ID" 
                           value="${data.ID_REMITENTE}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="ID_CLIENTE" type="number" class="validate" name="ID_CLIENTE"  
                           placeholder="ID_CLIENTE" value="${data.ID_CLIENTE}">
                    <label for="ID_CLIENTE">ID_CLIENTE</label>
                </div>
                <div class="input-field col s12">
                    <i class="material-icons prefix">short_text</i>
                    <input id="ID_DIRECCION" type="number" class="validate" name="ID_DIRECCION"  
                           placeholder="Descripción" value="${data.ID_DIRECCION}">
                    <label for="ID_DIRECCION">ID_DIRECCION</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />