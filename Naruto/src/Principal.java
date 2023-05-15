public class Principal {
    public static void main(String[] args) {
        System.out.println("SHINOBI 0: ");
        Naruto naruto = new Naruto("Naruto","Uzumaki","Carismatico","11");
        System.out.println(naruto);
        naruto.verificarEfecto();
        naruto.lanzar();
        naruto.transformarse();
        naruto.modoSabioActivado();

        System.out.println("SHINOBI 1: ");
        Sasuke sasuke = new Sasuke("Saske","Uchiha","Antipatico","11");
        sasuke.transformarse();
        sasuke.verificarEfecto();
        sasuke.lanzar();
        sasuke.despertarSharingan();
        sasuke.activacionPortal();
    }
}
