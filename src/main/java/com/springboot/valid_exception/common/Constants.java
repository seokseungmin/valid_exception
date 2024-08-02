package com.springboot.valid_exception.common;

public class Constants {

    public enum ExceptionClass {

        PRODUCT("Product");

        private String exceptionClass;

        ExceptionClass(String exceptionClass) {
            this.exceptionClass = exceptionClass;
        }

        String getExceptionClass(){
            return exceptionClass;
        }

        @Override
        public String toString(){
            return getExceptionClass() + " Exception";
        }
    }
}
