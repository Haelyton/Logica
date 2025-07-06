package Logica.Funcionarios;

public class Funcionario {

    private Integer id;
    private String nome;
    private double salario;
    private Funcionario[] funcionarios;

    public Funcionario() {
    }

    public Funcionario(final Integer id, final String nome, final double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(final double salario) {
        this.salario = salario;
    }

    public static Funcionario getIdEmployee(final Funcionario[] funcionarios, final int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null && funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    public double percentual(final double percentual) {
        return salario + (percentual / 100);
    }
}
