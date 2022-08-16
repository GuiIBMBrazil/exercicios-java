public class Funcionario {
    int id;
    String nome;
    double salario;

    public Funcionario(String nome,int id,double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }
    public void setAumentarSalary(double perc){
        double perc_100 = perc/100;
        this.salario += (this.salario)*perc_100;
    }

    @Override
    public String toString() {
        return this.id + "," + this.nome + "," + this.salario;
    }

    public double getSalario() {
        return salario;
    }
}
