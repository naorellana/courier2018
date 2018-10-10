<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


    <div class=" ">
        <form class=" center-align" action="${action}">
            <h1>Empleados </h1>
            <div class="row">
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_EMPLEADO"  placeholder="ID_EMPLEADO ID" 
                           value="${data.ID_EMPLEADO}">
                    <label for="icon_prefix">ID</label>
                </div>
                <div class="input-field col s6 m6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="number" class="validate"  name="ID_USUARIO"  placeholder="ID_USUARIO" 
                           value="${data.ID_USUARIO}">
                    <label for="icon_telephone">ID_USUARIO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_PERSONA"  placeholder="ID_PERSONA ID" 
                           value="${data.ID_PERSONA}">
                    <label for="icon_prefix">ID_PERSONA</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="text" class="validate" name="AREA_PUESTO"  placeholder="AREA_PUESTO" 
                           value="${data.AREA_PUESTO}">
                    <label for="icon_telephone">AREA_PUESTO</label>
                </div>
                <div class="input-field col s6">
                    <i class="material-icons prefix">monetization_on</i>
                    <input id="APELLIDOS" type="number" class="validate" name="SALARIOSALARIO"  placeholder="SALARIOSALARIO" 
                           value="${data.SALARIO}">
                    <label for="APELLIDOS">SALARIO</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>
                        <br>


<jsp:include page="../footer.jsp" />
