<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />


<div class="creaUsuario">
	<form action="${action}">
	<div class="form-group">
            <label for="id">ID</label>
    <input type="number" class="form-control" name="ID_DEPTO"  placeholder="Enter ID" value="${usuarios.ID_DEPTO}">
    </div>
		<div class="form-group">
    <label for="nombre">nombre</label>
    <input type="text" class="form-control" name="ID_PAIS"  placeholder="Enter ID_PAIS" value="${usuarios.ID_PAIS}">
    </div>
  <div class="form-group">
    <label for="correo">Email address</label>
    <input type="text" class="form-control" name="DEPTO" aria-describedby="emailHelp" placeholder="Enter Depart" value="${usuarios.DEPTO }">
    </div>
  <button type="submit" class=" btn blue">Enviar</button>
</form>
</div>




<jsp:include page="../footer.jsp" />
