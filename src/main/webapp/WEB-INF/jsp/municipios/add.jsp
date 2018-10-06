<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />





    <div class="row">
        <form class="col s12 center-align" action="${action}">
            <h1>Municipios </h1>
            <div class="row">
                <div class="input-field col s6">
                    <i class="material-icons prefix">vpn_key</i>
                    <input id="icon_prefix" type="number" class="validate" name="ID_MUN"  placeholder="Ingrese ID" value="${data.ID_MUN}">
                    <label for="icon_prefix">ID</label>
                </div>
                    
                <div class="input-field col s6">
                    <div class="input-field col s12">
                        <select name="ID_DEPTO">
                            <option value="<c:out value="${data.ID_DEPTO}" />"><c:out value="${data.ID_DEPTO}" /></option>
                            <c:forEach items="${dependencia}" var="dependencia">
                                <option value="<c:out value="${dependencia.ID_DEPTO}" />"><c:out value="${dependencia.DEPTO}" /></option>
                            </c:forEach>        
                        </select>
                        <label>Departamento</label>
                    </div>
                    
                </div>
                <div class="input-field col s12">
                    <i class="material-icons prefix">short_text</i>
                    <input id="icon_telephone" type="text" class="validate" name="MUNICIPIO"  placeholder="Descripción" value="${data.MUNICIPIO}">
                    <label for="icon_telephone">DESCRIPCION</label>
                </div>
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />
