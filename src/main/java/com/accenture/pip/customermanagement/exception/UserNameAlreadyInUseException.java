package com.accenture.pip.customermanagement.exception;

import com.accenture.pip.customermanagement.constants.CustomerManagementConstant;
import org.springframework.http.HttpStatus;

public class UserNameAlreadyInUseException  extends AbstractCustomerManagementException {

    public UserNameAlreadyInUseException(final Throwable cause) {

        super(cause, HttpStatus.BAD_REQUEST, CustomerManagementConstant.USER_NAME_IN_USE_EXCEPTION);
    }

    public UserNameAlreadyInUseException() {

        super(null, HttpStatus.BAD_REQUEST, CustomerManagementConstant.USER_NAME_IN_USE_EXCEPTION);
    }
}