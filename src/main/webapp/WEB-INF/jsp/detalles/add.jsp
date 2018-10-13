<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class=" ">
        <form class=" center-align" action="${action}">
            <h1>Detalle </h1>
            <div class="row">
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_DETALLE"  placeholder="Ingrese ID" 
                           value="${data.ID_DETALLE}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate"  name="ID_FACTURA"  placeholder="NIT" 
                           value="${data.ID_FACTURA}">
                    <label for="icon_telephone">ID_FACTURA</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_PAQUETE"  placeholder="ID_DIRECCION ID" 
                           value="${data.ID_PAQUETE}">
                    <label for="icon_prefix">ID_PAQUETE</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate" name="NUMERO_UNIDADES"  placeholder="ID_PERSONA" 
                           value="${data.NUMERO_UNIDADES}">
                    <label for="icon_telephone">NUMERO_UNIDADES</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="APELLIDOS" type="number" class="validate" name="PRECIO"  placeholder="ID_SERVICIO" 
                           value="${data.PRECIO}">
                    <label for="APELLIDOS">PRECIO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="text" class="validate"  name="IVA"  placeholder="TELEFONO" 
                           value="${data.IVA}">
                    <label for="icon_telephone">IVA</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="text" class="validate"  name="TOTAL"  placeholder="TELEFONO" 
                           value="${data.TOTAL}">
                    <label for="icon_telephone">TOTAL</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="text" class="validate"  name="GARANTIA"  placeholder="TELEFONO" 
                           value="${data.GARANTIA}">
                    <label for="icon_telephone">GARANTIA</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>
                        <br>


<jsp:include page="../footer.jsp" />
