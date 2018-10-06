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
                    <input id="icon_prefix" type="number" class="validate" name="ID_DIRECCION"  placeholder="Ingrese ID" value="${data.ID_DIRECCION}">
                    <label for="icon_prefix">ID</label>
                </div>
                    
                <div class="input-field col s6">
                    <div class="input-field col s12">
                        <select name="ID_MUN">
                            <option value="<c:out value="${data.ID_MUN}" />"><c:out value="${data.ID_MUN}" /></option>
                            <c:forEach items="${dependencia}" var="dependencia">
                                <option value="<c:out value="${dependencia.ID_MUN}" />"><c:out value="${dependencia.MUNICIPIO}" /></option>
                            </c:forEach>        
                        </select>
                        <label>MUNICIPIO</label>
                    </div>
                    
                </div>
                            <div class="row">
                                <div class="input-field col 4">
                                    <i class="material-icons prefix">short_text</i>
                                    <input id="icon_telephone" type="text" class="validate" name="CALLE"  
                                           placeholder="Descripción" value="${data.CALLE}">
                                    <label for="icon_telephone">CALLE</label>
                                </div>
                                <div class="input-field col 4">
                                    <i class="material-icons prefix">short_text</i>
                                    <input id="icon_telephone" type="text" class="validate" name="AVENIDA"  
                                           placeholder="Descripción" value="${data.AVENIDA}">
                                    <label for="icon_telephone">AVENIDA</label>
                                </div>
                                <div class="input-field col 4">
                                    <i class="material-icons prefix">short_text</i>
                                    <input id="icon_telephone" type="number" class="validate" name="ZONA"  
                                           placeholder="Descripción" value="${data.ZONA}">
                                    <label for="icon_telephone">ZONA</label>
                                </div>
                            </div>
                
            </div>
                    <button class="btn waves-effect waves-light" type="submit" name="action">${action}
                        <i class="material-icons right">send</i>
                    </button>
        </form>
    </div>



<jsp:include page="../footer.jsp" />
