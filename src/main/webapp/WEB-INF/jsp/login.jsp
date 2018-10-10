<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp" />
 <div class="container center-align">
     <br><br>
    <h1>Iniciar Sesion</h1>
        <!-- Page Content goes here -->
        
        <div class="row">
            <form class="col s12" action="/login" method='POST'>
                <div class="row">
                    <div class="input-field col s12 m6">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="icon_prefix" type="text" class="validate" name="username">
                        <label for="icon_prefix">Usuario</label>
                    </div>
                    <div class="input-field col s12 m6">
                        <i class="material-icons prefix">security</i>
                        <input id="icon_telephone" type="password" class="validate" name="password">
                        <label for="icon_telephone">Contraseña</label>
                    </div>
                </div>
                <input name="submit" type="submit" value="submit" class="btn  black hoverable" />
                
            </form>
        </div>
        <p><c:if test="${not empty errorMessge}"><div class="red-text">${errorMessge}</div></c:if></p>
      </div>
 <jsp:include page="footer.jsp" />
