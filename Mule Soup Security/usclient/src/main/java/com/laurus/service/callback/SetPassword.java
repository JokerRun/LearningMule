/**
 * 
 */
package com.laurus.service.callback;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

/**
 * @author JerryRun
 * 2019年1月29日
 */
public class SetPassword implements CallbackHandler,Callable{

    private Map<String, String>passwords=new HashMap<String, String>();
    
    public void putPasswords(String username,String password) {
        this.passwords.put(username, password);
    }


    /* (non-Javadoc)
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */
    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback pc=(WSPasswordCallback) callbacks[0];
        pc.setPassword("Jerry's password");
    }


    /* 
     * @see org.mule.api.lifecycle.Callable#onCall(org.mule.api.MuleEventContext)
     */
    @Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
        String user = eventContext.getMessage().getOutboundProperty("user");
        String password = eventContext.getMessage().getOutboundProperty("password");
        this.putPasswords(user, password);
        return eventContext.getMessage().getPayload();
    }

    


}
