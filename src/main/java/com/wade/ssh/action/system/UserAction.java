package com.wade.ssh.action.system;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return super.execute();
    }
}
