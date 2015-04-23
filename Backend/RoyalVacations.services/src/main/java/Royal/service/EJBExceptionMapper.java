package Royal.service;

import java.sql.SQLIntegrityConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.ejb.EJBException;
import javax.ws.rs.core.Response.Status;

@Provider
public class EJBExceptionMapper implements ExceptionMapper<EJBException> {

    public Response toResponse(EJBException exception) {
        String msg = "No se pudo ejecutar la acción.";
        Status status = Response.Status.INTERNAL_SERVER_ERROR;
        if (isCause(exception,SQLIntegrityConstraintViolationException.class)) {
            status = Response.Status.CONFLICT;
            msg = "No se puede borrar el registro porque tiene llaves foráneas asociadas";
        }
        return Response.status(status)
                .entity(msg)
                .type(MediaType.TEXT_PLAIN)
                .build();
    }

    private boolean isCause(Throwable e, Class c){
        if (e.getClass() == c) {
            return true;
        } else {
            if (e.getCause() != null) {
                return isCause(e.getCause(),c);
            }else{
                return false;
            }
        }
    }
}
