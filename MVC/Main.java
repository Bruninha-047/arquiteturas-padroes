import controller.PerfilController;
import model.Perfil;
import view.TelaPerfil;

public class Main {
    public static void main(String[] args) {
        PerfilController controller = new PerfilController();
        TelaPerfil view = new TelaPerfil();

        Perfil perfil = controller.criarPerfil("Bruna", 18, "Desenvolvedora");
        view.exibirPerfil(perfil);
    }
}
