package com.test3.book.Exception;

public class HnDException {
    public class hndexception extends Exception {
        String mesg;
        public hndexception(String mesg){
            this.mesg = mesg;
        }
        public String getMessage(){
            return this.mesg;
        }

    }
}
