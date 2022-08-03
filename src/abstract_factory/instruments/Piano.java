package abstract_factory.instruments;

import abstract_factory.Interfaces.Instrument;

public class Piano implements Instrument {
    private int code;
    @Override
    public int generateCode() {
        int codePiano = (int) (Math.random()*4729);
        return codePiano;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }
    @Override
    public void codeInstrument() {
        System.out.println("Code of the Piano: " + getCode());
    }


}
