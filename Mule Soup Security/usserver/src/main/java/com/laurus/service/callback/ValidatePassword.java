/**
 * 
 */
package com.laurus.service.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

/**
 * @author JerryRun
 * 2019年1月29日
 */
public class ValidatePassword implements CallbackHandler {

    /* (non-Javadoc)
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */
    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
       WSPasswordCallback pc= (WSPasswordCallback) callbacks[0];
       boolean equals = pc.getIdentifier().equals("Jerry");
       if (equals) {
        pc.setPassword("Jerry's password");
    }
    }

}
