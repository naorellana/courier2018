<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class="row center-align">
         <h1>Paquete</h1>
        <form class="col s12" action="${action}">
            <div class="row">
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_PAQUETE"  placeholder="ID" 
                           value="${data.ID_PAQUETE}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="ID_CLIENTE" type="text" class="validate" name="TIPO_PAQUETE"  
                           placeholder="ID_CLIENTE" value="${data.TIPO_PAQUETE}">
                    <label for="ID_CLIENTE">TIPO_PAQUETE</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="PESO" type="number" class="validate" name="PESO"  
                           placeholder="Descripción" value="${data.PESO}">
                    <label for="PESO">PESO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="UNIDADES" type="number" class="validate" name="UNIDADES"  
                           placeholder="UNIDADES" value="${data.UNIDADES}">
                    <label for="UNIDADES">UNIDADES</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />