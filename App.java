public class App {
    
    public static void main(String[] args) {
        // Criando um objeto da classe Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setInscricao(12345);
        funcionario.setSalario(2500.0);
        funcionario.setTurno("Manhã");

        // Imprimindo informações do Funcionário
        System.out.println("Informações do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Inscrição: " + funcionario.getInscricao());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Turno: " + funcionario.getTurno());

        // Criando um objeto da classe Secretario
        Secretario secretario = new Secretario();
        secretario.setNome("Maria");
        secretario.setInscricao(54321);
        secretario.setSalario(3000.0);
        secretario.setTurno("Tarde");

        // Imprimindo informações do Secretário
        System.out.println("\nInformações do Secretário:");
        System.out.println("Nome: " + secretario.getNome());
        System.out.println("Inscrição: " + secretario.getInscricao());
        System.out.println("Salário: " + secretario.getSalario());
        System.out.println("Turno: " + secretario.getTurno());

        // Criando um objeto da classe Professor
        Professor professor = new Professor();
        professor.setNome("Carlos");
        professor.setInscricao(98765);
        professor.setSalario(3500.0);
        professor.setTurno("Manhã");
        professor.setDisciplina("Matemática");

        // Imprimindo informações do Professor
        System.out.println("\nInformações do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Inscrição: " + professor.getInscricao());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println("Turno: " + professor.getTurno());
        System.out.println("Disciplina: " + professor.getDisciplina());

        // Criando um objeto da classe Diretor 
        Diretor diretor = new Diretor();
        diretor.setNome("Maria");
        diretor.setInscricao(3645);
        diretor.setSalario(5789.0);
        diretor.setTurno("Manhã");
        
        // Imprimindo informações do Diretor 
        System.out.println("\nInformações do Diretor:");
        System.out.println("Nome " + diretor.getNome());
        System.out.println("Inscrição: " + diretor.getInscricao());
        System.out.println("Salário: " + diretor.getSalario());
        System.out.println("Turno: " + diretor.getTurno());

        // Criando um objeto da classe Coordenador 
        Coordenador coordenador = new Coordenador();
        coordenador.setNome("Clara");
        coordenador.setInscricao(9887);
        coordenador.setSalario(4567.0);
        coordenador.setTurno("Tarde");

        // Imprimindo informações do Coordenador
        System.out.println("\nInformações do Coordenador:");
        System.out.println("Nome: " + coordenador.getNome());
        System.out.println("Inscrição " + coordenador.getInscricao());
        System.out.println("Salário: " + coordenador.getSalario());
        System.out.println("Turno: " + coordenador.getTurno());

    }
}
