<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class="row center-align">
         <h1>Factura</h1>
        <form class="col s12" action="${action}">
            <div class="row">
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_FACTURA"  placeholder="ID" 
                           value="${data.ID_FACTURA}">
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
                    <input id="ID_DIRECCION" type="text" class="validate" name="FECHA"  
                           placeholder="Descripción" value="${data.FECHA}">
                    <label for="ID_DIRECCION">FECHA</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />