public class FullStackDeveloper implements Backend,Frontend {

    @Override
    public void developServer() {
        System.out.println("Делаю сервер");
    }

    @Override
    public void developGUI() {
        System.out.println("Делаю GUI");
    }
}
