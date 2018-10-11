<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class=" row">
        <form class=" center-align" action="${action}">
            <h1>Vehículo </h1>
            <div class="">
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_VEHICULO"  placeholder="Ingrese ID" 
                           value="${data.ID_VEHICULO}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="PLACA"  placeholder="PLACA ID" 
                           value="${data.PLACA}">
                    <label for="icon_prefix">PLACA</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="text" class="validate" name="PESO"  placeholder="PESO" 
                           value="${data.PESO}">
                    <label for="icon_telephone">PESO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="APELLIDOS" type="text" class="validate" name="MARCA"  placeholder="MARCA" 
                           value="${data.MARCA}">
                    <label for="APELLIDOS">MARCA</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate"  name="COLOR"  placeholder="COLOR" 
                           value="${data.COLOR}">
                    <label for="icon_telephone">COLOR</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="text" class="validate"  name="TIPO"  placeholder="TIPO" 
                           value="${data.TIPO}">
                    <label for="icon_telephone">TIPO</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />
