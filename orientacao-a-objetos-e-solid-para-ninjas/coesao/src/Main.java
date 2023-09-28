import com.kleberaluizio.livro.CalculadoraDeSalario;
import com.kleberaluizio.livro.Cargo;
import com.kleberaluizio.livro.Funcionario;
import com.kleberaluizio.livro.RegraDeCalculo;

public class Main {
    public static void main(String[] args) {

//        Developer dev = new Developer("Nari",4000.0);
//        DBA dba = new DBA("Jorge", 2000.0);
//
//        CalculadoraDeSalario calc1 = new CalculadoraDeSalario();
//        System.out.println(calc1.calcular(dev));
//        System.out.println(calc1.calcular(dba));

        Funcionario f1 = new Funcionario("Nari",4000.0, Cargo.DESENVOLVEDOR);
        Funcionario f2 = new Funcionario("Jorge", 2000.0, Cargo.DBA);

        CalculadoraDeSalario calc = new CalculadoraDeSalario();

        System.out.println(calc.calcular(f1));
        System.out.println(calc.calcular(f2));






    }
}