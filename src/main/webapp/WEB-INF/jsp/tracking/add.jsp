<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class=" ">
        <form class=" center-align" action="${action}">
            <h1>Tracking </h1>
            <div class="row">
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="TRACKING_NUMBER"  placeholder="Ingrese ID" 
                           value="${data.TRACKING_NUMBER}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate"  name="ID_ESTADO"  placeholder="NIT" 
                           value="${data.ID_ESTADO}">
                    <label for="icon_telephone">ID_ESTADO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_PAQUETE"  placeholder="ID_DIRECCION ID" 
                           value="${data.ID_PAQUETE}">
                    <label for="icon_prefix">ID_PAQUETE</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate" name="ID_FLOTILLA"  placeholder="ID_PERSONA" 
                           value="${data.ID_FLOTILLA}">
                    <label for="icon_telephone">ID_FLOTILLA</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="APELLIDOS" type="number" class="validate" name="ID_REMITENTE"  placeholder="ID_SERVICIO" 
                           value="${data.ID_REMITENTE}">
                    <label for="APELLIDOS">ID_REMITENTE</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="number" class="validate"  name="ID_DESTINATARIO"  placeholder="TELEFONO" 
                           value="${data.ID_DESTINATARIO}">
                    <label for="icon_telephone">ID_DESTINATARIO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="text" class="validate"  name="FECHA_ENVIO"  placeholder="TELEFONO" 
                           value="${data.FECHA_ENVIO}">
                    <label for="icon_telephone">FECHA_ENVIO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="text" class="validate"  name="FECHA_ENTREGA"  placeholder="TELEFONO" 
                           value="${data.FECHA_ENTREGA}">
                    <label for="icon_telephone">FECHA_ENTREGA</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>
                        <br>


<jsp:include page="../footer.jsp" />
