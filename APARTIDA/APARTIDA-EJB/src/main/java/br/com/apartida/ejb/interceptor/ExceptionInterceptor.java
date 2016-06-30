/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.interceptor;

import br.com.apartida.ejb.exception.ConfigExceptionFactory;
import br.com.apartida.ejb.exception.ConfigExceptions;
import br.com.apartida.bean.exception.IspoException;
import java.io.Serializable;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.persistence.NoResultException;
import org.slf4j.Logger;

/**
 *
 * @author dudu
 */
public class ExceptionInterceptor implements Serializable {

    private static final long serialVersionUID = -9040625680866234297L;

    @Inject
    protected Logger logger;

    @AroundInvoke
    public Object interceptException(InvocationContext invocationContext) throws Exception {
        Object resultado = null;

        logger.debug("Invocando EJB " + invocationContext.getMethod().getName());

        try {
            resultado = invocationContext.proceed();

        } catch (Exception e) {
            if (e instanceof IspoException) {
                throw e;
            } else if (e instanceof NoResultException) {
                throw ConfigExceptionFactory.criarException(ConfigExceptions.ERRO001);
            } else {
                logger.error(e.getMessage());
            }
            throw ConfigExceptionFactory.criarException(ConfigExceptions.ERRO002);
        }

        logger.debug("Finalização EJB " + invocationContext.getMethod().getName());

        return resultado;
    }

}
