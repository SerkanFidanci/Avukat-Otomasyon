package com.example.demoo.Core.utilitiesresult;

public class SuccesDataResult<T> extends DataResult<T>{

    public SuccesDataResult(T data, String message) {
        super(data, true, message);
    }
    public SuccesDataResult(T data){
        super(data,true);
    }

    public SuccesDataResult(String message) {
        super(null,true, message);
    }
}
