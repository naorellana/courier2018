<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class="row">
        <form class="col s12" action="${action}">
            <div class="row">
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_DEPTO"  placeholder="Ingrese ID" value="${data.ID_DEPTO}">
                    <label for="icon_prefix">First Name</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_PAIS"  placeholder="Ingrese ID_PAIS" value="${data.ID_PAIS}">
                    <label for="icon_prefix">Pais</label>
                </div>
                <div class="input-field col s12">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="text" class="validate" name="DEPTO"  placeholder="Descripción" value="${data.DEPTO}">
                    <label for="icon_telephone">Telephone</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />