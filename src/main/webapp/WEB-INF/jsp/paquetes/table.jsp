<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />
        <div class="container">
            <div class="row  col 12 center-align">
                <h1>Paquete</h1>
                <p>
                    <a href="<c:url value="newPaquete" />" class="btn-floating waves-effect waves-light"><i class="material-icons green">add</i></a>
                </p>
                <table class="highlight bordered table-responsive centered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>TIPO_PAQUETE</th>
                            <th>PESO</th>
                            <th>UNIDADES</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.ID_PAQUETE}" /></td>
                                <td><c:out value="${dato.TIPO_PAQUETE}" /></td>
                                <td><c:out value="${dato.PESO}" /></td>
                                <td><c:out value="${dato.UNIDADES}" /></td>
                                <td>
                                    <a href="<c:url value="editPaquete?id=${dato.ID_PAQUETE}" />">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light blue"><i class="material-icons">edit</i></button></a>
                                    <a href="<c:url value="deletePaquete?id=${dato.ID_PAQUETE}" />">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light red"><i class="material-icons">delete</i></button></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </div>
<jsp:include page="../footer.jsp" />