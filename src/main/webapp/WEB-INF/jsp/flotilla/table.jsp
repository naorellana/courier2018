<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />
        <div class="container">
            <div class="row  col 12 center-align">
                <h1>Flotilla</h1>
                <p>
                    <a href="<c:url value="newFlotilla" />" class="btn-floating waves-effect waves-light"><i class="material-icons green">add</i></a>
                </p>
                <table class="highlight bordered table-responsive centered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>ID_VEHICULO</th>
                            <th>ID_EMPLEADO</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.ID_FLOTILLA}" /></td>
                                <td><c:out value="${dato.ID_VEHICULO}" /></td>
                                <td><c:out value="${dato.ID_EMPLEADO}" /></td>
                                <td>
                                    <a href="<c:url value="editFlotilla?id=${dato.ID_FLOTILLA}" />">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light blue"><i class="material-icons">edit</i></button></a>
                                    <a href="<c:url value="deleteFlotilla?id=${dato.ID_FLOTILLA}" />">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light red"><i class="material-icons">delete</i></button></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </div>
<jsp:include page="../footer.jsp" />