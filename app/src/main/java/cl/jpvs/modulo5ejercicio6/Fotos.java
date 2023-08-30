package cl.jpvs.modulo5ejercicio6;

public class Fotos {
    protected String text, url;

    public Fotos(String text, String url){
        this.text = text;
        this.url = url;
    }
    public String getText() {
        return  text;}
    public void  setText(String text) {
        this.text = text;
    }
    public String getUrl() {
        return url;}
    public  void setUrl(String url) {
        this.url = url;
    }
}
