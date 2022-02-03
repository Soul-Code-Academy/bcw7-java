
public class Triangulo {

	private float altura;
    private float base;
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

  
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularArea(){
        return (base * altura)/2;
    }
}
