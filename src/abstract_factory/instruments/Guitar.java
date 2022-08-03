package abstract_factory.instruments;

import abstract_factory.Interfaces.Instrument;

public class Guitar implements Instrument {
    private int code;
    @Override
    public void codeInstrument() {
        System.out.println("Code of the Guitar: " + getCode());
    }

    @Override
    public int generateCode() {
        int codeGuitar = (int) (Math.random()*2879);
        return codeGuitar;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }
}
