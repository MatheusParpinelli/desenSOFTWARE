import java.util.Calendar;

public class Animal {
	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private Calendar nascimento = Calendar.getInstance();
	private String habitatNatural;
	private boolean alimento = false;
	
	public boolean alimentado() {
		if(this.alimento) {
			
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Calendar getNascimento() {
		return this.nascimento;
	}
	
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getHabitatNatural() {
		return this.habitatNatural;
	}
	
	public void setHabitatNatural(String habitatNatural) {
		this.habitatNatural = habitatNatural;
	}
	
	
	public String toString() {
		return this.nome + "\t" + this.altura + "\t" + this.genero + "\t" + this.habitatNatural + "\t" + this.peso + "\t" + this.nascimento.toString();
	}
	
	
	
	

}
