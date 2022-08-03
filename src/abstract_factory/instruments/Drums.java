package abstract_factory.instruments;

import abstract_factory.Interfaces.Instrument;

public class Drums implements Instrument {
    private int code;
    @Override
    public int generateCode() {
        int codeDrums = (int) (Math.random()*2489);
        return codeDrums;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }
    @Override
    public void codeInstrument() {
        System.out.println("Code of the Drums: " + getCode());
    }
}
