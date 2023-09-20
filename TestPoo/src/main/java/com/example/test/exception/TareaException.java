package com.example.test.exception;


public class TareaException extends RuntimeException {
   public TareaException(String errorMessage) {
      super(errorMessage);
   }

   public TareaException(String errorMessage, Throwable err) {
      super(errorMessage, err);
   }
}
